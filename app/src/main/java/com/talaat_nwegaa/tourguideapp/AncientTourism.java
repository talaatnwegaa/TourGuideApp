package com.talaat_nwegaa.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AncientTourism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        // Create a list of Tourism
        final ArrayList<Tourism> tour = new ArrayList<Tourism>();

        tour.add(new Tourism("pyramids", R.drawable.pyramids, "Built during a time when Egypt was one of the richest and most powerful civilizations in the world, the pyramids—especially the Great Pyramids of Giza—are some of the most magnificent man-made structures in history.","https://www.tripadvisor.com/Hotel_Review-g294202-d2074035-Reviews-Pyramids_View_Inn-Giza_Giza_Governorate.html"));
        tour.add(new Tourism("Abu Simbel Temple", R.drawable.abu_simbel_temples, "Abu Simbel, site of two temples built by the Egyptian king Ramses II,Construction of the temple complex started in approximately 1264 BC and lasted for about 20 years,located in Aswān,southern Egypt.","https://www.tripadvisor.com/Tourism-g297540-Abu_Simbel_Aswan_Governorate_Nile_River_Valley-Vacations.html"));
        tour.add(new Tourism("Hatchepsut Temple", R.drawable.hatchepsut_temple, "The Temple of Hatshepsut is not only a memorial temple that honors Queen Hatshepsut, it is also one of the greatest Egyptian architectural achievements. Designed by Senenmut (Hatshepsut’s steward and architect), this mortuary temple closely resembles the classical Greek architecture of 1,000 years later.","https://www.tripadvisor.com/Attraction_Review-g294205-d318962-Reviews-Temple_of_Hatshepsut_at_Deir_el_Bahari-Luxor_Nile_River_Valley.html"));
        tour.add(new Tourism("Karnak_Temple", R.drawable.karnak_temple, "Karnak is an ancient Egyptian temple precinct located on the east bank of the Nile River in Thebes (modern-day Luxor). It covers more than 100 hectares,Construction at Karnak started by 4,000 years ago and continued up until the time the Romans took control of Egypt, about 2,000 years ago.","https://www.tripadvisor.com/AttractionProductDetail-g294205-d11455789-Karnak"));
        tour.add(new Tourism("Luxor_Temple", R.drawable.luxor_temple, "Luxor Temple is a large Ancient Egyptian temple complex located on the east bank of the Nile River in the city today known as Luxor (ancient Thebes) and was constructed approximately 1400 BCE","https://www.tripadvisor.com/Attraction_Review-g294205-d318954-Reviews-Luxor_Temple-Luxor_Nile_River_Valley.html"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourismAdapter adapter = new TourismAdapter(this, tour, R.color.ancient_egypt_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}