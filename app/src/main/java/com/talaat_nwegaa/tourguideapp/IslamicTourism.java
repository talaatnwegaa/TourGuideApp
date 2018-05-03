package com.talaat_nwegaa.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class IslamicTourism extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Create a list of Tourism
        final ArrayList<Tourism> tour = new ArrayList<Tourism>();
        tour.add(new Tourism("Saladin Citadel",R.drawable.saladin,"The Citadel was fortified by the Ayyubid ruler Salah al-Din (Saladin) between 1176 and 1183 CE, to protect cairo from the Crusaders","https://www.tripadvisor.com/AttractionProductDetail-g294201-d12464989-Private_Tour_to_Saladin_Citadel_and_Egyptian_Cooking_Class_in_Cairo-Cairo_Cairo_Governorate.html?from_tpa=true"));
        tour.add(new Tourism("Muizz Street",R.drawable.muizz_street,"Muizz Street (Al Moez Ldin Allah Al Fatimi Street in Islamic Cairo, Egypt is one of the oldest streets in Cairo, approximately one kilometer long. A United Nations study found it to have the greatest concentration of medieval architectural treasures in the Islamic world.","https://www.tripadvisor.com/Attraction_Review-g294201-d1015353-Reviews-Sharia_Al_Mu_izz_Li_Din_Allah-Cairo_Cairo_Governorate.html"));
        tour.add(new Tourism("Khan el-Khalili",R.drawable.alkhalili_bazar,"Khan el-Khalili is a major souk in the historic center of Islamic Cairo. The bazaar district is one of Cairo's main attractions for tourists and Egyptians alike.","https://www.tripadvisor.com/Attraction_Review-g294201-d308884-Reviews-Khan_Al_Khalili-Cairo_Cairo_Governorate.html"));
        tour.add(new Tourism("Sultan Hassan Mosque",R.drawable.sultan_hassan_mosque,"The Mosque-Madrassa of Sultan Hassan is a massive mosque and madrassa located in the Old city of Cairo, it was built during the Mamluk Islamic era in Egypt. Its construction began 757 AH/1356 CE.","https://en.wikipedia.org/wiki/Mosque-Madrassa_of_Sultan_Hassan"));
        tour.add(new Tourism("Citadel of Qaitbay",R.drawable.qaitbay_citadel,"The Citadel of Qaitbay is a 15th-century defensive fortress located on the Mediterranean sea coast, in Alexandria, Egypt. It was established in 1477 AD (882 AH) by Sultan Al-Ashraf Sayf al-Din Qa'it Bay.","https://en.wikipedia.org/wiki/Citadel_of_Qaitbay"));
        tour.add(new Tourism("Al Azhar Mosque",R.drawable.al_azhar_mosque," is an Egyptian mosque in Islamic Cairo. Al-Mu'izz li-Din Allah of the Fatimid dynasty commissioned its construction for the newly established capital city in 970,the mosque slowly developed into what is today the second oldest continuously run university in the world after Al Karaouine. ","https://en.wikipedia.org/wiki/Al-Azhar_Mosque"));
        tour.add(new Tourism("Amr ibn al-As Mosque",R.drawable.amr_ibn_alas_mosque,"Mosque of Amr, was originally built in 641–642 AD, as the center of the newly founded capital of Egypt, Fustat. The original structure was the first mosque ever built in Egypt and the whole of Africa.","https://en.wikipedia.org/wiki/Mosque_of_Amr_ibn_al-As"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourismAdapter adapter = new TourismAdapter(this, tour, R.color.islamic_egypt_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
