package legup;

import edu.rpi.legup.save.InvalidFileFormatException;
import org.junit.*;
import puzzles.battleship.rules.*;
import puzzles.nurikabe.rules.*;
import puzzles.lightup.rules.*;

/* GLOBAL TESTER FOR THE GIVEN RULES FOR EACH PUZZLE IN PUZZLES FOLDER IN TESTS */
public final class GlobalTester {

    @Test
    // Implemented a global test function that will go through each puzzle's
    // rule to test the rules and have for testing purposes
    public void globalTester() throws InvalidFileFormatException {
        // Calls to each respective helper function per puzzle
        BattleShipTester();
        LightupTester();
        NurikabeTester();
    }

    @BeforeClass
    /* BATTLESHIP TESTER FOR THE GIVEN RULE TESTS IN PUZZLES FOLDER */
    public static void BattleShipTester() throws InvalidFileFormatException {
        // Setting up a Battleship tester for the Adjacent Ships Contradiction Rule Test
        AdjacentShipsContradictionRuleTest BattleshipContradictionTest = new AdjacentShipsContradictionRuleTest();
//        BattleshipContradictionTest.OrthogonalAdjacentTest();
//        BattleshipContradictionTest.InvalidOrthogonalAdjacentTest();
        // Setting up a Battleship tester for the Finish With Ships Direct Rule Test
<<<<<<< Updated upstream
        FinishWithShipsBasicRuleTests BattleshipDirectTest = new FinishWithShipsBasicRuleTests();
=======
        FinishWithShipsDirectRuleTests BattleshipDirectTest = new FinishWithShipsDirectRuleTests();
>>>>>>> Stashed changes

    }

    @BeforeClass
    /* LIGHTUP TESTER FOR THE GIVEN RULE TESTS IN PUZZLES FOLDER */
    public static void LightupTester(){
        // Setting up a Lightup tester for the Bulbs In Path Contradiction Rule Test
        BulbsInPathContradictionRuleTest LightupBulbPathContradictionTest = new BulbsInPathContradictionRuleTest();

        // Setting up a Lightup tester for the cant Lightup A Cell Contradiction Rule Test
        CannotLightACellContradictionRuleTest LightupCantLightCellContradictionTest = new CannotLightACellContradictionRuleTest();

        // Setting up a Lightup tester for the Empty Cell Light Direct Rule Test
<<<<<<< Updated upstream
        EmptyCellinLightBasicRuleTest LightupEmptyCellTest = new EmptyCellinLightBasicRuleTest();

        // Setting up a Lightup tester for the Empty Cell in Light Test
        EmptyCellinLightBasicRuleTest EmptyCellinLightTest = new EmptyCellinLightBasicRuleTest();

        // Setting up a Lightup tester for the Empty Corners Test
        EmptyCornersBasicRuleTest EmptyCornersTest = new EmptyCornersBasicRuleTest();

        // Setting up a Lightup tester for the Finish With Bulbs Basic Rule Test
        FinishWithBulbsBasicRuleTest FinishWithBulbsTest = new FinishWithBulbsBasicRuleTest();

        // Setting up a Lightup tester for the Finish With Empty Basic Rule Test
        FinishWithEmptyBasicRuleTest FinishWithEmptyTest = new FinishWithEmptyBasicRuleTest();

        // Setting up a Lightup tester for the Finish With Light Or Empty Basic Rule Test
        LightOrEmptyCaseRuleTest FinishWithLightOrEmptyTest = new LightOrEmptyCaseRuleTest();

        // Setting up a Lightup tester for the Must Light Basic Rule Test
        MustLightBasicRuleTest MustLightTest = new MustLightBasicRuleTest();

        // Setting up a Lightup tester for the Satisfy Number Basic Rule Test
=======
        EmptyCellinLightDirectRuleTest LightupEmptyCellTest;

        // Setting up a Lightup tester for the Empty Corners Test
        EmptyCornersDirectRuleTest EmptyCornersTest;

        // Setting up a Lightup tester for the Finish With Bulbs Direct Rule Test
        FinishWithBulbsDirectRuleTest FinishWithBulbsTest = new FinishWithBulbsDirectRuleTest();

        // Setting up a Lightup tester for the Finish With Empty Direct Rule Test
        FinishWithEmptyDirectRuleTest FinishWithEmptyTest = new FinishWithEmptyDirectRuleTest();

        // Setting up a Lightup tester for the Finish With Light Or Empty Direct Rule Test
        LightOrEmptyCaseRuleTest FinishWithLightOrEmptyTest = new LightOrEmptyCaseRuleTest();

        // Setting up a Lightup tester for the Must Light Direct Rule Test
        MustLightDirectRuleTest MustLightTest = new MustLightDirectRuleTest();

        // Setting up a Lightup tester for the Satisfy Number Direct Rule Test
>>>>>>> Stashed changes
        SatisfyNumberCaseRuleTest SatisfyNumberTest = new SatisfyNumberCaseRuleTest();

        // Setting up a Lightup tester for the Too Few Bulbs Contradiction Rule Test
        TooFewBulbsContradictionRuleTest TooFewBulbsTest = new TooFewBulbsContradictionRuleTest();

        // Setting up a Lightup tester for the Too Many Bulbs Contradiction Rule Test
        TooManyBulbsContradictionRuleTest TooManyBulbsTest = new TooManyBulbsContradictionRuleTest();

    }

    @BeforeClass
    /* NURIKABE TESTER FOR THE GIVEN RULE TESTS IN PUZZLES FOLDER */
    public static void NurikabeTester(){

<<<<<<< Updated upstream
        // Setting up a Nurikabe tester for the Black Between Regions Basic Rule Test
        BlackBetweenRegionsBasicRuleTest BlackBetweenRegionsTest = new BlackBetweenRegionsBasicRuleTest();

        // Setting up a Nurikabe tester for the Black Bottle Neck Basic Rule Test
        BlackBottleNeckBasicRuleTest BlackBottleNeckTest = new BlackBottleNeckBasicRuleTest();
=======
        // Setting up a Nurikabe tester for the Black Between Regions Direct Rule Test
        BlackBetweenRegionsDirectRuleTest BlackBetweenRegionsTest = new BlackBetweenRegionsDirectRuleTest();

        // Setting up a Nurikabe tester for the Black Bottle Neck Direct Rule Test
        BlackBottleNeckDirectRuleTest BlackBottleNeckTest = new BlackBottleNeckDirectRuleTest();
>>>>>>> Stashed changes

        // Setting up a Nurikabe tester for the Black or White Case Rule Test
        BlackOrWhiteCaseRuleTest BlackOrWhiteTest = new BlackOrWhiteCaseRuleTest();

        // Setting up a Nurikabe tester for the Black Square Contradiction Rule Test
        BlackSquareContradictionRuleTest BlackSquareTest = new BlackSquareContradictionRuleTest();

<<<<<<< Updated upstream
        // Setting up a Nurikabe tester for the Fillin Black Basic Rule Test
        FillinBlackBasicRuleTest FillinBlackTest = new FillinBlackBasicRuleTest();


        // Setting up a Nurikabe tester for the Fillin White Basic Rule Test
        FillinWhiteBasicRuleTest FillinWhiteTest = new FillinWhiteBasicRuleTest();
=======
        // Setting up a Nurikabe tester for the Fillin Black Direct Rule Test
        FillinBlackDirectRuleTest FillinBlackTest = new FillinBlackDirectRuleTest();


        // Setting up a Nurikabe tester for the Fillin White Direct Rule Test
        FillinWhiteDirectRuleTest FillinWhiteTest = new FillinWhiteDirectRuleTest();
>>>>>>> Stashed changes

        // Setting up a Nurikabe tester for the Isolate Black Contradiction Rule Test
        IsolateBlackContradictionRuleTest IsolateBlackTest = new IsolateBlackContradictionRuleTest();

        // Setting up a Nurikabe tester for the Multiple Numbers Contradiction Rule Test
        MultipleNumbersContradictionRuleTest MultipleNumbersTest = new MultipleNumbersContradictionRuleTest();

        // Setting up a Nurikabe tester for the No Numbers Contradiction Rule Test
        NoNumbersContradictionRuleTest NoNumbersTest = new NoNumbersContradictionRuleTest();

<<<<<<< Updated upstream
        // Setting up a Nurikabe tester for the Prevent Black Square Basic Rule Test
        PreventBlackSquareBasicRuleTest PreventBlackSquaresTest = new PreventBlackSquareBasicRuleTest();

        // Setting up a Nurikabe tester for the Surround Region Basic Rule Test
        SurroundRegionBasicRuleTest SurroundRegionTest = new SurroundRegionBasicRuleTest();
=======
        // Setting up a Nurikabe tester for the Prevent Black Square Direct Rule Test
        PreventBlackSquareDirectRuleTest PreventBlackSquaresTest = new PreventBlackSquareDirectRuleTest();

        // Setting up a Nurikabe tester for the Surround Region Direct Rule Test
        SurroundRegionDirectRuleTest SurroundRegionTest = new SurroundRegionDirectRuleTest();
>>>>>>> Stashed changes

        // Setting up a Nurikabe tester for the Too Few Spaces Contradiction Rule Test
        TooFewSpacesContradictionRuleTest TooFewSpacesTest = new TooFewSpacesContradictionRuleTest();

        // Setting up a Nurikabe tester for the Too Many Spaces Contradiction Rule Test
        TooManySpacesContradictionRuleTest TooManySpacesTest = new TooManySpacesContradictionRuleTest();

<<<<<<< Updated upstream
        // Setting up a Nurikabe tester for teh White Bottle Neck Basic Rule Test
        WhiteBottleNeckBasicRuleTest WhiteBottleNeckTest = new WhiteBottleNeckBasicRuleTest();
=======
        // Setting up a Nurikabe tester for teh White Bottle Neck Direct Rule Test
        WhiteBottleNeckDirectRuleTest WhiteBottleNeckTest = new WhiteBottleNeckDirectRuleTest();
>>>>>>> Stashed changes

    }


}
