package devpaul.business.empresaexample.network;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import devpaul.business.empresaexample.R;

public class AdapterReomendaciones extends RecyclerView.Adapter<AdapterReomendaciones.ViewHolder> {
    private Context mcontext;
    private ArrayList<recomendaciones> mlista;

    private List<recomendaciones> recomendaciones;


    public AdapterReomendaciones(Context mcontext, List<recomendaciones> recomendaciones) {
        this.mcontext = mcontext;
        this.recomendaciones = recomendaciones;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recomendaciones,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.nombre.setText(""+recomendaciones.get(position).getName());
        holder.descripcion.setText(""+recomendaciones.get(position).getDescription());
        holder.fecha.setText(""+recomendaciones.get(position).getFecha());

    }

    @Override
    public int getItemCount() {
        System.out.println("No. Registros: "+recomendaciones.size());
        return recomendaciones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView nombre;
        public TextView descripcion;
        public TextView fecha;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nombre=itemView.findViewById(R.id.nombre_text);
            descripcion=itemView.findViewById(R.id.desc_text);
            fecha=itemView.findViewById(R.id.fecha_text);

        }

    }

}
