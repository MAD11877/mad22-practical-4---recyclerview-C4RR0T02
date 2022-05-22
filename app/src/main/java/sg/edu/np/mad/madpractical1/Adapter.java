package sg.edu.np.mad.madpractical1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<VH> {

    ArrayList<User> userList;

    public Adapter(ArrayList<User> user) {
        this.userList = user;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_vh , parent, false);
            return new VH(item);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        User s = userList.get(position);
        holder.name.setText(s.Name);
        holder.description.setText(s.Description);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
