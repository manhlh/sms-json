package linearlayout.example.manh.onthi_sms_map_json.MyAdaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import linearlayout.example.manh.onthi_sms_map_json.Model.Contact;
import linearlayout.example.manh.onthi_sms_map_json.R;

/**
 * Created by MANH on 20-May-16.
 */
public class BaseAdapter extends android.widget.BaseAdapter {

    ArrayList<Contact> contactArrayList;
    Context mcontext;
    int mlayout;

    public BaseAdapter(ArrayList<Contact> conArrayList, Context mcontext, int mlayout) {
        this.contactArrayList = conArrayList;
        this.mcontext = mcontext;
        this.mlayout = mlayout;
    }

    @Override
    public int getCount() {
        return contactArrayList.size();
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

        View rowview = convertView;
        LayoutInflater inflater = (LayoutInflater)mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(rowview == null){
            ViewHolder viewHolder = new ViewHolder();
            rowview = inflater.inflate(mlayout,null);
            viewHolder.tvName = (TextView)rowview.findViewById(R.id.tvNameContact);
            viewHolder.tvMobile = (TextView)rowview.findViewById(R.id.tvMobileContact);
            viewHolder.tvAddress = (TextView) rowview.findViewById(R.id.tvAddressContact);
            viewHolder.imgAvatar = (ImageView)rowview.findViewById(R.id.imgImageContact);
            rowview.setTag(viewHolder);
        }
        ViewHolder view = (ViewHolder)rowview.getTag();
        view.tvName.setText(contactArrayList.get(position).getName());
        view.tvMobile.setText(contactArrayList.get(position).getMobile());
        view.tvAddress.setText(contactArrayList.get(position).getAddress());
        view.imgAvatar.setImageBitmap(contactArrayList.get(position).getImage());

        return rowview;
    }

    public class ViewHolder{
        TextView tvName;
        TextView tvMobile;
        TextView tvAddress;
        ImageView imgAvatar;
    }
}
