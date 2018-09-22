package sprouts.library.android;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.Toast;

public class Toastie extends Toast {

    public Toastie(Context context) {
        super(context);
    }

    public static void show(final Context context, final String toastMessage) {
        MediaPlayer.create(context, R.raw.beep).start();
        Toast.makeText(context, toastMessage, Toast.LENGTH_LONG).show();
    }

}