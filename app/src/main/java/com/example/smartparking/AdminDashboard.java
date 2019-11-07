/*
package com.example.smartparking;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class AdminDashboard extends AppCompatActivity {
    DatabaseReference adminRef,parkingRef;
    TextView avgUsage,pricePerHr,adminName,adminId,lowHr,peakHr;
    ListView listViewParking;
    ArrayList<ParkingSlotObject> obj;
    Button see;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);
       Intent i=getIntent();
        String adminPath = i.getStringExtra("adminkey");
        Log.v("retrieval","reached here path"+adminPath);
        avgUsage=findViewById(R.id.avgUsage);
        adminName=findViewById(R.id.adminName);
        adminId=findViewById(R.id.adminId);
        lowHr=findViewById(R.id.lowhr);
        peakHr=findViewById(R.id.peakhr);
        pricePerHr=findViewById(R.id.pricePerHR);
        listViewParking=findViewById(R.id.listviewParkingSlots);
        see=findViewById(R.id.button);

parkingRef=FirebaseDatabase.getInstance().getReference("PARKING_SLOT");
if(adminPath==null) {
    String email = i.getStringExtra("email");
    String newemail=email.replace('.','_');
    Log.v("retrieval", "reached here email" + newemail);

    adminRef = FirebaseDatabase.getInstance().getReference("ADMIN/"+newemail);

}
else {
    adminRef = FirebaseDatabase.getInstance().getReference("ADMIN/" + adminPath);
}
        adminRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                AdminObject value = dataSnapshot.getValue(AdminObject.class);
                Log.d("retrieval", "Value is: " + value.getName()+"\n"+value.getKey());

               avgUsage.setText(String.valueOf( value.getAvgUsage()));
                adminName.setText((value.getName()));
                adminId.setText(value.getKey());
               lowHr.setText(String.valueOf( value.getLowHr()));
               peakHr.setText(String.valueOf( value.getPeakHr()));
               pricePerHr.setText(String.valueOf(value.getPricePerHour()));
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("retrieval", "Failed to read value.", error.toException());
            }
        });

parkingRef.addValueEventListener(new ValueEventListener() {
    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        Log.v("retrieval","entered here");

        obj= new ArrayList<>();
        for (DataSnapshot postSnapshot: dataSnapshot.getChildren())
        {
            ParkingSlotObject value = postSnapshot.getValue(ParkingSlotObject.class);
            Log.v("retrival",value.getKey());
            Log.v("retrival",value.getCapacity()+"\t"+value.getArea()+"\t "+ value.getLocation()+" \t"+ value.getNameOfArea());
//error after this....may b due to null values
         //   obj.add(new ParkingSlotObject(value.getCapacity(),value.getArea(),value.getLocation(),value.getNameOfArea()));
        }

        objAdapter adapter = new objAdapter(getApplicationContext(), obj);

        listViewParking.setAdapter(adapter);



    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {
        Toast.makeText(AdminDashboard.this, "Error in retriving", Toast.LENGTH_SHORT).show();

        Log.v("retrival: ","error in retriving t show in listview");

    }

});


    }
}
*/

package com.example.smartparking;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AdminDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);
    }
}