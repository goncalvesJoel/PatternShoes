package com.es2.memento;

import java.util.ArrayList;

//caretaker
public class BackupService extends Object {
    private ShoesVersion shoesVersion;
    private ArrayList<Memento> aSnapshots =new ArrayList<>();

    public BackupService(ShoesVersion shoesModel) {
        this.shoesVersion =shoesModel;
    }

    public void takeSnapshot() {
        aSnapshots.add(shoesVersion.backup());
    }
    public void restoreSnapshot()
            throws NotExistingSnapshotException{
        if(aSnapshots.isEmpty() || aSnapshots.size()==1)
            throw new NotExistingSnapshotException();
        else
            shoesVersion.restore(aSnapshots.get(aSnapshots.size()-2));

    }

    public void restoreSnapshotUtilizador(int snapshotNumber) throws NotExistingSnapshotException {
        if(aSnapshots.isEmpty() || aSnapshots.size()==1)
            throw new NotExistingSnapshotException();
        else
            shoesVersion.restore(aSnapshots.get(snapshotNumber));
    }
}
