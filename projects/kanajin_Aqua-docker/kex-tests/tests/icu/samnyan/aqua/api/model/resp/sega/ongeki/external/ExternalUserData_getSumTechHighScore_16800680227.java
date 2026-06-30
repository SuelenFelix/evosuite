package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_getSumTechHighScore_16800680227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106842;

    public ExternalUserData_getSumTechHighScore_16800680227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106842 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term106842, term106842.getClass(), "accessCode", "CImdJnlRdG");
        setField(term106842, term106842.getClass(), "userName", "LyGapeDCrW");
        setIntField(term106842, term106842.getClass(), "level", -375034390);
        setIntField(term106842, term106842.getClass(), "reincarnationNum", 1702296888);
        setLongField(term106842, term106842.getClass(), "exp", 5323883456740583519L);
        setLongField(term106842, term106842.getClass(), "point", -5292614708144298436L);
        setLongField(term106842, term106842.getClass(), "totalPoint", 5962096497172262429L);
        setIntField(term106842, term106842.getClass(), "playCount", -756394730);
        setIntField(term106842, term106842.getClass(), "jewelCount", 534673432);
        setIntField(term106842, term106842.getClass(), "totalJewelCount", -1733312320);
        setIntField(term106842, term106842.getClass(), "medalCount", 1708846793);
        setIntField(term106842, term106842.getClass(), "playerRating", -750826742);
        setIntField(term106842, term106842.getClass(), "highestRating", -229247080);
        setIntField(term106842, term106842.getClass(), "battlePoint", -1427020394);
        setIntField(term106842, term106842.getClass(), "bestBattlePoint", -1417844026);
        setIntField(term106842, term106842.getClass(), "overDamageBattlePoint", -1372489085);
        setIntField(term106842, term106842.getClass(), "nameplateId", 1996829329);
        setIntField(term106842, term106842.getClass(), "trophyId", -1533725937);
        setIntField(term106842, term106842.getClass(), "cardId", 1228012080);
        setIntField(term106842, term106842.getClass(), "characterId", -509162873);
        setIntField(term106842, term106842.getClass(), "tabSetting", 148693332);
        setIntField(term106842, term106842.getClass(), "tabSortSetting", -1996842886);
        setIntField(term106842, term106842.getClass(), "cardCategorySetting", 447146208);
        setIntField(term106842, term106842.getClass(), "cardSortSetting", -2086241472);
        setIntField(term106842, term106842.getClass(), "rivalScoreCategorySetting", 1507593981);
        setIntField(term106842, term106842.getClass(), "playedTutorialBit", 1644303447);
        setIntField(term106842, term106842.getClass(), "firstTutorialCancelNum", -870427720);
        setLongField(term106842, term106842.getClass(), "sumTechHighScore", 1987635967184493092L);
        setLongField(term106842, term106842.getClass(), "sumTechBasicHighScore", 4864144176037460244L);
        setLongField(term106842, term106842.getClass(), "sumTechAdvancedHighScore", -457660150580130067L);
        setLongField(term106842, term106842.getClass(), "sumTechExpertHighScore", 5137382071068804795L);
        setLongField(term106842, term106842.getClass(), "sumTechMasterHighScore", 670070327724971227L);
        setLongField(term106842, term106842.getClass(), "sumTechLunaticHighScore", 8534940695365868418L);
        setLongField(term106842, term106842.getClass(), "sumBattleHighScore", 6141950199644561235L);
        setLongField(term106842, term106842.getClass(), "sumBattleBasicHighScore", -6326228260050563017L);
        setLongField(term106842, term106842.getClass(), "sumBattleAdvancedHighScore", -6960859150814287131L);
        setLongField(term106842, term106842.getClass(), "sumBattleExpertHighScore", 3786521201412149676L);
        setLongField(term106842, term106842.getClass(), "sumBattleMasterHighScore", 6229800505568460683L);
        setLongField(term106842, term106842.getClass(), "sumBattleLunaticHighScore", -46966081812728169L);
        setField(term106842, term106842.getClass(), "eventWatchedDate", "ALYWlwCrwr");
        setField(term106842, term106842.getClass(), "cmEventWatchedDate", "LelNgmGobv");
        setField(term106842, term106842.getClass(), "firstGameId", "FXtdzjkLzT");
        setField(term106842, term106842.getClass(), "firstRomVersion", "YduVFSJBxN");
        setField(term106842, term106842.getClass(), "firstDataVersion", "IJoWrLUoeM");
        setField(term106842, term106842.getClass(), "firstPlayDate", "xGCxVibNhv");
        setField(term106842, term106842.getClass(), "lastGameId", "xNAvYNENIY");
        setField(term106842, term106842.getClass(), "lastRomVersion", "gmBThrkbST");
        setField(term106842, term106842.getClass(), "lastDataVersion", "nEvNkKgEaE");
        setField(term106842, term106842.getClass(), "compatibleCmVersion", "HFTZIfyiOH");
        setField(term106842, term106842.getClass(), "lastPlayDate", "FtUKzMSHFT");
        setIntField(term106842, term106842.getClass(), "lastPlaceId", -19469788);
        setField(term106842, term106842.getClass(), "lastPlaceName", "VZyEZzGNCU");
        setIntField(term106842, term106842.getClass(), "lastRegionId", -1140525884);
        setField(term106842, term106842.getClass(), "lastRegionName", "DvjdMhkqjR");
        setIntField(term106842, term106842.getClass(), "lastAllNetId", 1456213785);
        setField(term106842, term106842.getClass(), "lastClientId", "FQpFdeajFj");
        setIntField(term106842, term106842.getClass(), "lastUsedDeckId", -1494391269);
        setIntField(term106842, term106842.getClass(), "lastPlayMusicLevel", -1261374379);
        setIntField(term106842, term106842.getClass(), "lastEmoneyBrand", -1787578734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechHighScore", argTypes, term106842, args);
    }

};


