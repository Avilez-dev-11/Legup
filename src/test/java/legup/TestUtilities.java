package legup;

import edu.rpi.legup.model.Puzzle;
import edu.rpi.legup.model.gameboard.Board;
import edu.rpi.legup.model.tree.Tree;
import edu.rpi.legup.model.tree.TreeNode;
import edu.rpi.legup.model.tree.TreeTransition;
import edu.rpi.legup.save.InvalidFileFormatException;
//import puzzles.battleship.rules;
//import puzzles.lightup.rules;
//import puzzles.lightup.rules.CannotLightACellContradictionRuleTest;
//import puzzles.nurikabe.rules;
//import puzzles.shorttruthtable.rules;

public final class TestUtilities {
    public static void importTestBoard(String fileName, Puzzle puzzle) throws InvalidFileFormatException {
        puzzle.importPuzzle(ClassLoader.getSystemResourceAsStream(fileName));
        Tree tree = puzzle.getTree();
        TreeNode rootNode = tree.getRootNode();
        Board board = rootNode.getBoard().copy();
        TreeTransition transition = new TreeTransition(rootNode, board);
        rootNode.getChildren().add(transition);
    }

    // implementing a test function that will go through each puzzle rule to test the rules and have for testing purposes
//    public static void globalTester(){
//        /* BATTLESHIP TESTER FOR THE GIVEN RULE TESTS IN PUZZLES FOLDER */
//
//        // setting up a battelship tester for the adjacent ships contradiction rule test
//        AdjacentShipsContradictionRuleTest BattleshipContradictionTest = new AdjacentShipsContradictionRuleTest();
//        BattleshipContradictionTest.OrthogonalAdjacentTest();
//        BattleshipContradictionTest.InvalidOrthogonalAdjacentTest();
//
//        // setting up a battelship tester for the finish with ships direct rule test
//        FinishWithShipsDirectRuleTests BattleshipDirectTest = new FinishWithShipsDirectRuleTests();
//        BattleshipDirectTest.HorizontalValidTest();
//        BattleshipDirectTest.VerticaValidTest();
//        BattleshipDirectTest.HorizontalInvalidTest();
//        BattleshipDirectTest.VerticalInvalidTest();
//
//
//        /* LIGHTUP TESTER FOR THE GIVEN RULE TESTS IN PUZZLES FOLDER */
//
//        // setting up a lightup tester for the bulbs in path contradiction rule test
//        BulbsInPathContradictionRuleTest LightupBulbPathContradictionTest = new BulbsInPathContradictionRuleTest();
//        LightupBulbPathContradictionTest.BulbsInPathContradictionRule_LightInHorizontalPath();
//        LightupBulbPathContradictionTest.BulbsInPathContradictionRule_LightInVerticalPath();
//
//        // setting up a lightup tester for the cant lightup a cell contradiction rule test
//        CannotLightACellContradictionRuleTest LightupCantLightCellContradictionTest = new CannotLightACellContradictionRuleTest();
//        LightupCantLightCellContradictionTest.simpleCaseTest();
//
//        // setting up a lightup tester for the empty cell light direct rule test
//        EmptyCellinLightDirectRuleTest LightupEmptyCellTester = new EmptyCellinLightDirectRuleTest();
//    }

}
