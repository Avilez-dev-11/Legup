package edu.rpi.legup.puzzle.masyu;

import edu.rpi.legup.model.Puzzle;
import edu.rpi.legup.model.gameboard.Board;
import edu.rpi.legup.puzzle.masyu.rules.*;

public class Masyu extends Puzzle
{

    public Masyu()
    {
        super();

        this.name=  "Masyu";

        this.importer = new MasyuImporter(this);
        this.exporter = new MasyuExporter(this);

        this.factory = new MasyuCellFactory();

        this.basicRules.add(new BlackEdgeBasicRule());
        this.basicRules.add(new FinishPathBasicRule());
        this.basicRules.add(new NearWhiteBasicRule());
        this.basicRules.add(new OnlyOneChoiceBasicRule());
        this.basicRules.add(new WhiteEdgeBasicRule());
        this.basicRules.add(new ConnectedCellsBasicRule());
        this.basicRules.add(new BlockedBlackBasicRule());
    }

    /**
     * Initializes the game board. Called by the invoker of the class
     */
    @Override
    public void initializeView()
    {
        boardView = new MasyuView((MasyuBoard)currentBoard);
    }

    /**
     * Generates a random edu.rpi.legup.puzzle based on the difficulty
     *
     * @param difficulty level of difficulty (1-10)
     *
     * @return board of the random edu.rpi.legup.puzzle
     */
    @Override
    public Board generatePuzzle(int difficulty)
    {
        return null;
    }

    /**
     * Determines if the current board is a valid state
     *
     * @param board board to check for validity
     *
     * @return true if board is valid, false otherwise
     */
    @Override
    public boolean isBoardComplete(Board board)
    {
        return false;
    }

    /**
     * Callback for when the board puzzleElement changes
     *
     * @param board the board that has changed
     */
    @Override
    public void onBoardChange(Board board)
    {

    }
}
