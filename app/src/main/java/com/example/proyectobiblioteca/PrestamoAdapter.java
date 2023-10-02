package com.example.proyectobiblioteca;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PrestamoAdapter extends RecyclerView.Adapter<PrestamoAdapter.ItemViewHolder>{

    private List<Prestamo> prestamoList;
    private Context context;

    public PrestamoAdapter(Context context) {

        this.context = context;
    }

    public void setData(List<Prestamo> itemList){
        this.prestamoList = itemList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.prestamo_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Prestamo item = prestamoList.get(position);
        holder.imageView.setImageResource(item.getLibro().getImagen());
        holder.tituloText.setText(item.getLibro().getTitulo());
        holder.autorText.setText((item.getLibro().getAutor()));
        if (item.getEstado()==1)
            holder.estadoText.setText("Devuelto");
        if (item.getEstado()==2)
            holder.estadoText.setText("Perdido");
        if (item.getEstado()==0 && item.getFecha()<1000)
            holder.estadoText.setText("Atrasado");
        else if (item.getEstado() == 0 && item.getFecha() >= 1000) {
            holder.estadoText.setText("Vigente");
        }
    }

    @Override
    public int getItemCount() {
        return prestamoList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tituloText;
        TextView autorText;
        TextView estadoText;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_list);
            tituloText = itemView.findViewById(R.id.titulo_list);
            autorText = itemView.findViewById(R.id.autor_list);
            estadoText = itemView.findViewById(R.id.estado_list);

        }
    }

}
