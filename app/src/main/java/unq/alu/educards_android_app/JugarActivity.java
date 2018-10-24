package unq.alu.educards_android_app;

import android.content.ClipData;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class JugarActivity extends AppCompatActivity {


    ImageView image1, image2, image3, image4, image5;
    ImageView target;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);

        if (getIntent().hasExtra("unq.alu.educards_android_app.EXTRA")) {
            TextView name = (TextView) findViewById(R.id.textViewNamePlayer);
            String text = getIntent().getExtras().getString("unq.alu.educards_android_app.EXTRA");
            name.setText(text);


            image1 = (ImageView) findViewById(R.id.imageViewCard1);
            image2 = (ImageView) findViewById(R.id.imageViewCard2);
            image3 = (ImageView) findViewById(R.id.imageViewCard3);
            image4 = (ImageView) findViewById(R.id.imageViewCard4);
            image5 = (ImageView) findViewById(R.id.imageViewCard5);

            target = (ImageView) findViewById(R.id.imageViewTablero);

            image1.setOnLongClickListener(longClickListener);
            image2.setOnLongClickListener(longClickListener);
            image3.setOnLongClickListener(longClickListener);
            image4.setOnLongClickListener(longClickListener);
            image5.setOnLongClickListener(longClickListener);

            target.setOnDragListener(dragListener);


        }
    }

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {
            ClipData data = ClipData.newPlainText("","");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
            view.startDrag(data, shadowBuilder, view, 0);

            return true;
        }
    };

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View view, DragEvent dragEvent) {

            int event = dragEvent.getAction();
            final View v = (View) dragEvent.getLocalState();

            switch (event){
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:

                    v.animate()
                            .x(target.getX())
                            .y(target.getY())
                            .setDuration(700)
                            .start();
                    break;
            }
            return true;
        }
    };
}