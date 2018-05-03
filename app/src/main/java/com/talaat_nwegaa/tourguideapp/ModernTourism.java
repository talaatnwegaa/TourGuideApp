package com.talaat_nwegaa.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ModernTourism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Create a list of Tourism
        final ArrayList<Tourism> tour = new ArrayList<Tourism>();
        tour.add(new Tourism("Sharm El Sheikh",R.drawable.sharm_el_sheikh,"The southern coast of the Gulf of Aqaba, between Tiran Island and Ras Mohammed National Park, features some of the world’s most amazing underwater scenery. The crystal-clear waters and incredible variety of exotic fish darting in and out of the colourful coral reefs have made this a scuba-diving paradise. Purpose-built Sharm El Sheikh occupies a prime position here, devoting itself solely to sun-and-sea holidays offering a family-friendly vibe and resort comforts, with world-class diving thrown in.","https://www.tripadvisor.com/Attractions-g297555-Activities-Sharm_El_Sheikh_South_Sinai_Red_Sea_and_Sinai.html"));
        tour.add(new Tourism("Egyptian Museum",R.drawable.egyptian_museum,"the Egyptian Museum,in Cairo, Egypt, is home to an extensive collection of ancient Egyptian antiquities. It has 120,000 items, with a representative amount on display, the remainder in storerooms. The edifice is one of the largest museums in the region.","https://www.tripadvisor.com/Attraction_Review-g294201-d308825-Reviews-Egyptian_Antiquities_Museum-Cairo_Cairo_Governorate.html"));
        tour.add(new Tourism("Nile Cruise",R.drawable.nile_cruise,"Cruises are offered along the Nile ranging from short tours between Luxor and Aswan to longer cruises.Many cruises are aboard a larger vessel that functions as a floating hotel. Other Nile trips can be on a felucca, a traditional sailboat, on which overnight journeys may require passengers to sleep in the open air on deck and the sailors to double as cooks.","https://www.booking-tours.com/tours/Nile-Cruise-4-days-from-Cairo?"));
        tour.add(new Tourism("Cairo Tower",R.drawable.cairo_tower,"The Cairo Tower is a free-standing concrete tower located in Cairo, Egypt. At 187 m (614 ft),Build from 1954 to 1961,The tower is crowned by a circular observation deck and a rotating restaurant with a view over greater Cairo. ","https://en.wikipedia.org/wiki/Cairo_Tower"));
        tour.add(new Tourism("Bibliotheca Alexandrina",R.drawable.bibliotheca_alexandrina,"The Bibliotheca Alexandrina (English: Library of Alexandria) is a major library and cultural center located on the shore of the Mediterranean Sea in the Egyptian city of Alexandria. It is both a commemoration of the Library of Alexandria that was lost in antiquity, and an attempt to rekindle something of the brilliance that this earlier center of study and erudition represented. ","https://en.wikipedia.org/wiki/Bibliotheca_Alexandrina"));
        tour.add(new Tourism("Hurghada",R.drawable.hurghada,"Hurghada It is one of the country's main tourist centets located on the Red Sea coast.Holiday villages and hotels provide aquatic sport facilities for windsurfers, kitesurfers, yachtsmen, scuba divers and snorkelers. Hurghada is known for its watersports activities, nightlife and warm weather. ","https://www.tripadvisor.com/Attractions-g297549-Activities-Hurghada_Red_Sea_and_Sinai.html"));
        tour.add(new Tourism("Siwa Oasis",R.drawable.siwa_oasis,"Massages, hot springs, a completely solar powered city, a global destination for medical Tourism, a UNESCO world heritage site, and much more. This is a how Siwa is becoming not just a major Egyptian city, but a major destination for world Tourism.","https://www.tripadvisor.com/Tourism-g303857-Siwa_Matrouh_Governorate-Vacations.html"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourismAdapter adapter = new TourismAdapter(this, tour, R.color.modern_egypt_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
