/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mr.repository;

import java.util.List;
import lk.ijse.mr.core.FriendCircle;

/**
 *
 * @author Sanu
 */
public interface FriendCircleRepository {
    public boolean add(FriendCircle dto) throws Exception;
    public boolean delete(int id) throws Exception;
    public boolean update(FriendCircle dto) throws Exception;
    public FriendCircle search(int id) throws Exception;
    public List<FriendCircle> getList() throws Exception;
    public List<FriendCircle> getListA(String query) throws Exception; 
}
