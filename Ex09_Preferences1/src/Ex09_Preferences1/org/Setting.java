package Ex09_Preferences1.org;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Setting extends PreferenceActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.layout.settings);
	}
}
