package controller;

import controller.DAO.ReservationDAO;
import controller.DAO.RoomDAO;
import controller.DAO.UserDAO;
import model.Reservation;
import model.Room;
import model.User;
import view.ApplicationWindow;


import java.awt.*;

public class Main {

    public static void main(String[] args){


        /*EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ApplicationWindow app = new ApplicationWindow();
                } catch (Exception e) {
                  e.printStackTrace();
              }
          }
        });*/

        //HibernateUtils.init();

        User user = new User();
        user.setIdUser(56);
        user.setFirstName("tomY");
        user.setLastName("tom");
        UserDAO us = new UserDAO();
        us.create(user);
        //us.delete(user);
        //us.update(user);
        us.read();

        Room room = new Room();
        room.setIdRoom(67);
        RoomDAO rm = new RoomDAO();
        //rm.create(room);
        //rm.delete(room);
        rm.read();

        Reservation resa = new Reservation();
        resa.setIdReservation(970);
        resa.setUser(user);
        resa.setRoom(room);
        resa.setBeginTime(resa.stringToLDT("2022-01-21 10:00:00"));
        resa.setEndTime(resa.stringToLDT("2022-01-21 12:00:00"));

        //ReservationDAO resD = new ReservationDAO();
        //resD.create(resa);
        //resD.delete(resa);
        //HibernateUtils.close();





    }
}
