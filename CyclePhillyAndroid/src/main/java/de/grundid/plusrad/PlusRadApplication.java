package de.grundid.plusrad;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

public class PlusRadApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		if (!FirebaseApp.getApps(this).isEmpty()) { // check if this is the firebase crash process
			FirebaseDatabase.getInstance().setPersistenceEnabled(true);
		}
	}
}
