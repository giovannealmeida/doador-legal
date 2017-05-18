package br.com.doadorlegal.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.doadorlegal.R;
import br.com.doadorlegal.model.Person;

public class PersonFeedAdapter extends RecyclerView.Adapter<PersonFeedAdapter.ViewHolder> {

    private final List<Person> mValues;
    private Context context;

    public PersonFeedAdapter(List<Person> items, Context context) {
        mValues = items;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_person_feed, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.tvName.setText(mValues.get(position).getName());
        holder.tvBloodType.setText(mValues.get(position).getBloodType());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        final View mView;
        final TextView tvName;
        final TextView tvBloodType;
        Person mItem;

        ViewHolder(View view) {
            super(view);
            mView = view;
            tvName = (TextView) view.findViewById(R.id.tvName);
            tvBloodType = (TextView) view.findViewById(R.id.tvBloodType);
        }

    }
}