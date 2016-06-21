package neu.kamonnit.bookshop;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by iMac_08 on 6/20/2016 AD.
 */
public class MyAlert {

    public void myDialog(Context context,
                         String strTile,
                         String strMessage) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.hin03);
        builder.setTitle(strTile);
        builder.setMessage(strMessage);
        builder.setPositiveButton("เฮ็ดใหม่แหม่ะ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }


} // Main Class
