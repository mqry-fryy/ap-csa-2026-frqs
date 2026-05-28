public class courseRecord{
    int count = 0;

    for (courseRecord h : historyList){
        for (courseRecord m : mathList){
            if (h.getStudentID().equals(m.getStudentID)) &&
                h.getAbsences() > m.getAbsences())
            {
                count++;
            }
        }
    }
    return count;
}
