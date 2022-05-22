package sg.edu.np.mad.madpractical1;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class VH extends RecyclerView.ViewHolder {

    TextView name;
    TextView description;

    public VH(View v) {
        super(v);
        name = itemView.findViewById(R.id.Name);
        description = itemView.findViewById(R.id.Description);
    }
}
