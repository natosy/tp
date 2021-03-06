package seedu.budgetbaby.logic.commands;

import seedu.budgetbaby.model.BudgetBabyModel;

/**
 * Format help instructions for every command for display.
 */
public class HelpCommand extends BudgetBabyCommand {
    public static final String COMMAND_WORD = "help";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Shows program usage instructions.\n"
            + "Example: " + COMMAND_WORD;

    public static final String SHOWING_HELP_MESSAGE = "Opened help window.";

    @Override
    public CommandResult execute(BudgetBabyModel model) {
        return new CommandResult(SHOWING_HELP_MESSAGE, true, false);
    }
}
