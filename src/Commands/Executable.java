package Commands;

import Exceptions.NoSuchDragonException;

/**
 * шаблон команда
 */
public interface Executable {
    // Exception - костыль, можно изменить
    void execute(String[] cmdArgs) throws NoSuchDragonException;
}
