package TugasRefactoring.Setelah;

public class Group {
    /*
    public List getUsersSortedByMostRecentlyRegistered() {
        List users = new ArrayList();
        if (!userDirectoryExists())
            return users;

        addFoundUsersTo(users);
        sortByMostRecentlyRegistered(users);
        return users;
    }
    // ===== Method tambahan hasil refactoring =====
    private boolean userDirectoryExists() {
        return new File(persistencePath()).exists();
    }
    private void addFoundUsersTo(List users) {
        File[] files = new File(persistencePath()).listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                users.add(new User(file.getName(), this));
            }
        }
    }
    private void sortByMostRecentlyRegistered(List users) {
        Collections.sort(users,
                new User.UserComparatorByDescendingRegistration());
    }

     */
}
