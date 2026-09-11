package com.test.service;

import java.util.ArrayList;
import java.util.List;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import com.test.models.Session;

public class gestorSesiones {
    ArrayList<Session> sesiones = new ArrayList<>();
    


    public void agregarSesiones(int duration, int count, String topic){
        Session s1 = new Session(duration, count, topic);
        sesiones.add(s1);
    }

    public void imprimirSesiones(){
        for(Session s : sesiones){
            int x = s.getCount() * s.getDuration();
            System.out.println("Topic: "+s.getTopic()+" - Duration per session: "+s.getDuration()+" - Cantidad sesiones: "+s.getCount()+" - Tiempo total invertido: "+x+"m.");
        }
    }

    public void actualizarSesion(int id, int count){
        for(Session s : sesiones){
            if(id == s.getSessionId()){
                s.setCount(count);
            }
        }
    }

    public void eliminarSesion(int id){
        for(Session s : sesiones){
            if(id == s.getSessionId()){
                sesiones.remove(s);
            }
        }
    }

    
}
