package legup;

import org.junit.*;
import legup.TestUtilities;
import puzzles.battleship.rules.*;
import puzzles.nurikabe.rules.*;
import puzzles.lightup.rules.*;

public final class GlobalTester {

    @Test
    // implementing a test function that will go through each puzzle rule to test the rules and have for testing purposes
    public void globalTester(){
        BattleShipTester();
        LightupTester();
        NurikabeTester();
    }

    @BeforeClass
    /* BATTLESHIP TESTER FOR THE GIVEN RULE TESTS IN PUZZLES FOLDER */
    public static void BattleShipTester() {
        // Setting up a Battelship tester for the Adjacent Ships Contradiction Rule Test
        AdjacentShipsContradictionRuleTest BattleshipContradictionTest = new AdjacentShipsContradictionRuleTest();
//        BattleshipContradictionTest.OrthogonalAdjacentTest();
//        BattleshipContradictionTest.InvalidOrthogonalAdjacentTest();
//
        // Setting up a Battelship tester for the Finish With Ships Direct Rule Test
        FinishWithShipsBasicRuleTests BattleshipDirectTest = new FinishWithShipsBasicRuleTests();
//        BattleshipDirectTest.HorizontalValidTest();
//        BattleshipDirectTest.VerticaValidTest();
//        BattleshipDirectTest.HorizontalInvalidTest();
//        BattleshipDirectTest.VerticalInvalidTest();
//
    }

    @BeforeClass
    /* LIGHTUP TESTER FOR THE GIVEN RULE TESTS IN PUZZLES FOLDER */
    public static void LightupTester(){
        // Setting up a Lightup tester for the Bulbs In Path Contradiction Rule Test
        BulbsInPathContradictionRuleTest LightupBulbPathContradictionTest = new BulbsInPathContradictionRuleTest();
//        LightupBulbPathContradictionTest.BulbsInPathContradictionRule_LightInHorizontalPath();
//        LightupBulbPathContradictionTest.BulbsInPathContradictionRule_LightInVerticalPath();
//
        // Setting up a Lightup tester for the cant Lightup A Cell Contradiction Rule Test
        CannotLightACellContradictionRuleTest LightupCantLightCellContradictionTest = new CannotLightACellContradictionRuleTest();
//        LightupCantLightCellContradictionTest.simpleCaseTest();
//
        // Setting up a Lightup tester for the Empty Cell Light Direct Rule Test
        EmptyCellinLightBasicRuleTest LightupEmptyCellTest = new EmptyCellinLightBasicRuleTest();
//        LightupEmptyCellTest.simpleCaseTest();
//
        // Setting up a Lightup tester for the Empty Cell in Light Test
        EmptyCellinLightBasicRuleTest EmptyCellinLightTest = new EmptyCellinLightBasicRuleTest();
//        EmptyCellinLightTest.simpleCaseTest();
//
        // Setting up a Lightup tester for the Empty Corners Test
        EmptyCornersBasicRuleTest EmptyCornersTest = new EmptyCornersBasicRuleTest();
//        EmptyCornersTest.simpleCaseTest();
//
        // Setting up a Lightup tester for the Finish With Bulbs Basic Rule Test
        FinishWithBulbsBasicRuleTest FinishWithBulbsTest = new FinishWithBulbsBasicRuleTest();
//        FinishWithBulbsTest.simpleCaseTest();
//
        // Setting up a Lightup tester for the Finish With Empty Basic Rule Test
        FinishWithEmptyBasicRuleTest FinishWithEmptyTest = new FinishWithEmptyBasicRuleTest();
//        FinishWithEmptyTest.simpleCaseTest();
//
        // Setting up a Lightup tester for the Finish With Light Or Empty Basic Rule Test
        LightOrEmptyCaseRuleTest FinishWithLightOrEmptyTest = new LightOrEmptyCaseRuleTest();
//        FinishWithLightOrEmptyTest.simpleCaseTest();
//
        // Setting up a Lightup tester for the Must Light Basic Rule Test
        MustLightBasicRuleTest MustLightTest = new MustLightBasicRuleTest();
//        MustLightTest.simpleCaseTest();
//
        // Setting up a Lightup tester for the Satisfy Number Basic Rule Test
        SatisfyNumberCaseRuleTest SatisfyNumberTest = new SatisfyNumberCaseRuleTest();
//        SatisfyNumberTest.simpleCaseTest();
//
        // Setting up a Lightup tester for the Too Few Bulbs Contradiction Rule Test
        TooFewBulbsContradictionRuleTest TooFewBulbsTest = new TooFewBulbsContradictionRuleTest();
//        TooFewBulbsTest.simpleCaseTest();
//
        // Setting up a Lightup tester for the Too Many Bulbs Contradiction Rule Test
        TooManyBulbsContradictionRuleTest TooManyBulbsTest = new TooManyBulbsContradictionRuleTest();
//        TooManyBulbsTest.simpleCaseTest();
//
    }

    @BeforeClass
    /* NURIKABE TESTER FOR THE GIVEN RULE TESTS IN PUZZLES FOLDER */
    public static void NurikabeTester(){

        // Setting up a Nurikabe tester for the Black Between Regions Basic Rule Test
        BlackBetweenRegionsBasicRuleTest BlackBetweenRegionsTest = new BlackBetweenRegionsBasicRuleTest();
//        BlackBetweenRegionsTest.BlackBetweenRegionsBasicRule_DiagonalBlackBetweenRegions1Test();
//        BlackBetweenRegionsTest.BlackBetweenRegionsBasicRule_DiagonalBlackBetweenRegions2Test();
//        BlackBetweenRegionsTest.BlackBetweenRegionsBasicRule_HorizontalBlackBetweenRegionsTest();
//        BlackBetweenRegionsTest.BlackBetweenRegionsBasicRule_VerticalBlackBetweenRegionsTest();
//
        // Setting up a Nurikabe tester for the Black Bottle Neck Basic Rule Test
        BlackBottleNeckBasicRuleTest BlackBottleNeckTest = new BlackBottleNeckBasicRuleTest();
////        BlackBottleNeckTest.BlackBottleNeckBasicRule_TwoSurroundBlackTest();
//        // ^^ commented since needs work being implemented, missing throw exception
//
        // Setting up a Nurikabe tester for the Black or White Case Rule Test
        BlackOrWhiteCaseRuleTest BlackOrWhiteTest = new BlackOrWhiteCaseRuleTest();
////        BlackOrWhiteTest.TooFewSpacesContradictionRule_TwoSurroundBlackTest();
//
        // Setting up a Nurikabe tester for the Black Square Contradiction Rule Test
        BlackSquareContradictionRuleTest BlackSquareTest = new BlackSquareContradictionRuleTest();
//        BlackSquareTest.BlackSquareContradictionRule_TwoSurroundBlackTest();
//
        // Setting up a Nurikabe tester for the Fillin Black Basic Rule Test
        FillinBlackBasicRuleTest FillinBlackTest = new FillinBlackBasicRuleTest();
//        FillinBlackTest.FillinBlackBasicRule_UnknownSurroundBlackTest();
//

        // Setting up a Nurikabe tester for the Fillin White Basic Rule Test
        FillinWhiteBasicRuleTest FillinWhiteTest = new FillinWhiteBasicRuleTest();
//        FillinWhiteTest.FillinWhiteBasicRule_UnknownSurroundWhiteTest();
//
        // Setting up a Nurikabe tester for the Isolate Black Contradiction Rule Test
        IsolateBlackContradictionRuleTest IsolateBlackTest = new IsolateBlackContradictionRuleTest();
//        IsolateBlackTest.IsolateBlackContradictionRule_SimpleIsolateBlackTest();
//
        // Setting up a Nurikabe tester for the Multiple Numbers Contradiction Rule Test
        MultipleNumbersContradictionRuleTest MultipleNumbersTest = new MultipleNumbersContradictionRuleTest();
//        MultipleNumbersTest.MultipleNumbersContradictionRule_TwoSurroundBlackTest();
//
        // Setting up a Nurikabe tester for the No Numbers Contradiction Rule Test
        NoNumbersContradictionRuleTest NoNumbersTest = new NoNumbersContradictionRuleTest();
//        NoNumbersTest.TooFewSpacesContradictionRule_TwoSurroundBlackTest();
//
        // Setting up a Nurikabe tester for the Prevent Black Square Basic Rule Test
        PreventBlackSquareBasicRuleTest PreventBlackSquaresTest = new PreventBlackSquareBasicRuleTest();
//        PreventBlackSquaresTest.PreventBlackSquareBasicRule_BottomLeftWhiteBlackSquareTest();
//        PreventBlackSquaresTest.PreventBlackSquareBasicRule_BottomRightWhiteBlackSquareTest();
//        PreventBlackSquaresTest.PreventBlackSquareBasicRule_TopLeftWhiteBlackSquareTest();
//        PreventBlackSquaresTest.PreventBlackSquareBasicRule_TopRightWhiteBlackSquareTest();
//
        // Setting up a Nurikabe tester for the Surround Region Basic Rule Test
        SurroundRegionBasicRuleTest SurroundRegionTest = new SurroundRegionBasicRuleTest();
//        SurroundRegionTest.SurroundRegionBasicRule_SurroundRegionBlackTest();
//
        // Setting up a Nurikabe tester for the Too Few Spaces Contradiciton Rule Test
        TooFewSpacesContradictionRuleTest TooFewSpacesTest = new TooFewSpacesContradictionRuleTest();
//        TooFewSpacesTest.TooFewSpacesContradictionRule_TwoSurroundBlackTest();
//
        // Setting up a Nurikabe tester for the Too Many Spaces Contradiction Rule Test
        TooManySpacesContradictionRuleTest TooManySpacesTest = new TooManySpacesContradictionRuleTest();
//        TooManySpacesTest.TooManySpacesContradictionRule_TwoSurroundBlackTest();
//
        // Setting up a Nurikabe tester for teh White Bottle Neck Basic Rule Test
        WhiteBottleNeckBasicRuleTest WhiteBottleNeckTest = new WhiteBottleNeckBasicRuleTest();
//        WhiteBottleNeckTest.WhiteBottleNeckBasicRule_SimpleWhiteBottleNeckTest();
//        WhiteBottleNeckTest.WhiteBottleNeckBasicRule_NurikabeBoard1Test();
    }


}
