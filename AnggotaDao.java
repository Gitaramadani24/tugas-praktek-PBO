/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gita.model;
import java.util.List;
/**
 *
 * @author LABMM07
 */
public interface AnggotaDao {
    void save(Anggota anggota);
    void update(int index, Anggota anggota);
    void delete (int index);
    Anggota getAnggota(int index);
    List<Anggota> getAll();
}
