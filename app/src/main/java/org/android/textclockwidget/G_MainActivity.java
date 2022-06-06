package org.android.textclockwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class G_MainActivity extends AppWidgetProvider {

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.g_activity_main);

        Intent iAbout = new Intent(context, About_Widget_MainActivity.class);
        PendingIntent piAbout = PendingIntent.getActivity(context,0,iAbout,0);

        views.setOnClickPendingIntent(R.id.heart_layout_01, piAbout);
        views.setOnClickPendingIntent(R.id.heart_layout_02, piAbout);
        views.setOnClickPendingIntent(R.id.heart_layout_03, piAbout);
        views.setOnClickPendingIntent(R.id.heart_layout_04, piAbout);

        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }

}

