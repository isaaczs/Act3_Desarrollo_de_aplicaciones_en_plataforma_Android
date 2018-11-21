package com.zermeno.isaac.act3_android;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {
    String nombre;
    String pApellido;
    String sApellido;
    int edad;

    public Usuario(){
        this.nombre = "";
        this.pApellido = "";
        this.sApellido = "";
        this.edad = 0;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(pApellido);
        dest.writeString(sApellido);
        dest.writeInt(edad);
    }

    public static final Parcelable.Creator<Usuario> CREATOR
            = new Parcelable.Creator<Usuario>(){
        public Usuario createFromParcel(Parcel in){
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };

    public Usuario(Parcel in){
        nombre = in.readString();
        pApellido = in.readString();
        sApellido = in.readString();
        edad = in.readInt();
    }
}
