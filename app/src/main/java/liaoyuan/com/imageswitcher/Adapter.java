package liaoyuan.com.imageswitcher;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by blue on 2016/3/31.
 */
public class Adapter extends BaseAdapter{
    private Integer[] mThumbIds = { R.drawable.b, R.drawable.c,
            R.drawable.d, R.drawable.f, R.drawable.g,
    };
    private Context mContext;
    public Adapter(Context c) {
        mContext = c;
    }
    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView i = new ImageView(mContext);
        i.setImageResource(mThumbIds[position]);
        i.setAdjustViewBounds(true);
        i.setLayoutParams(new Gallery.LayoutParams(
                Gallery.LayoutParams.WRAP_CONTENT, Gallery.LayoutParams.WRAP_CONTENT));
        i.setBackgroundResource(R.drawable.e);
        return i;
    }
}
