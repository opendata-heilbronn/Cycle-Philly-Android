package de.grundid.plusrad;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.support.v7.app.NotificationCompat;

public class NotificationUtils {

	public static void showNotification(Context context, int notifId, int iconId, String title, String message,
			String summary, PendingIntent pendingIntent) {
		NotificationCompat.BigTextStyle bigTextStyle = new android.support.v4.app.NotificationCompat.BigTextStyle();
		bigTextStyle.setBigContentTitle(title);
		bigTextStyle.bigText(message);
		bigTextStyle.setSummaryText(summary);
		Notification notification = new NotificationCompat.Builder(context)
				.setSmallIcon(iconId)
				.setContentTitle(title)
				.setContentText(message)
				.setColor(context.getResources().getColor(R.color.primary))
				.setStyle(bigTextStyle)
				.setContentIntent(pendingIntent)
				.setLights(context.getResources().getColor(R.color.primary), 1000, 500)
				.setVibrate(new long[] { 0, 250, 250, 250 })
				.setAutoCancel(true).build();
		NotificationManager notificationManager =
				(NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
		notificationManager.notify(notifId, notification);
	}
}
