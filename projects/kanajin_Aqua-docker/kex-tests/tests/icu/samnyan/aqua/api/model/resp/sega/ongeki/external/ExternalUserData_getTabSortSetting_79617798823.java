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

public class ExternalUserData_getTabSortSetting_79617798823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3173332;

    public ExternalUserData_getTabSortSetting_79617798823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3173332 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3173332, term3173332.getClass(), "accessCode", "jJVqggNzrE");
        setField(term3173332, term3173332.getClass(), "userName", "eJBxikWrNE");
        setIntField(term3173332, term3173332.getClass(), "level", 1201122615);
        setIntField(term3173332, term3173332.getClass(), "reincarnationNum", -1518106641);
        setLongField(term3173332, term3173332.getClass(), "exp", 4539160404175088743L);
        setLongField(term3173332, term3173332.getClass(), "point", -1922573476941664585L);
        setLongField(term3173332, term3173332.getClass(), "totalPoint", 2362998680626545423L);
        setIntField(term3173332, term3173332.getClass(), "playCount", -393928125);
        setIntField(term3173332, term3173332.getClass(), "jewelCount", 99102566);
        setIntField(term3173332, term3173332.getClass(), "totalJewelCount", -90503090);
        setIntField(term3173332, term3173332.getClass(), "medalCount", -1233263560);
        setIntField(term3173332, term3173332.getClass(), "playerRating", -1086162643);
        setIntField(term3173332, term3173332.getClass(), "highestRating", 611742104);
        setIntField(term3173332, term3173332.getClass(), "battlePoint", 1834608033);
        setIntField(term3173332, term3173332.getClass(), "bestBattlePoint", -1128409315);
        setIntField(term3173332, term3173332.getClass(), "overDamageBattlePoint", 684915262);
        setIntField(term3173332, term3173332.getClass(), "nameplateId", -722793363);
        setIntField(term3173332, term3173332.getClass(), "trophyId", -1914524188);
        setIntField(term3173332, term3173332.getClass(), "cardId", -898581094);
        setIntField(term3173332, term3173332.getClass(), "characterId", 52692666);
        setIntField(term3173332, term3173332.getClass(), "tabSetting", 211971854);
        setIntField(term3173332, term3173332.getClass(), "tabSortSetting", -1580699458);
        setIntField(term3173332, term3173332.getClass(), "cardCategorySetting", 432228609);
        setIntField(term3173332, term3173332.getClass(), "cardSortSetting", 23664998);
        setIntField(term3173332, term3173332.getClass(), "rivalScoreCategorySetting", -2072633920);
        setIntField(term3173332, term3173332.getClass(), "playedTutorialBit", -495602191);
        setIntField(term3173332, term3173332.getClass(), "firstTutorialCancelNum", 154854229);
        setLongField(term3173332, term3173332.getClass(), "sumTechHighScore", 5146322677949710550L);
        setLongField(term3173332, term3173332.getClass(), "sumTechBasicHighScore", -6460332287900206843L);
        setLongField(term3173332, term3173332.getClass(), "sumTechAdvancedHighScore", -7669029110100029380L);
        setLongField(term3173332, term3173332.getClass(), "sumTechExpertHighScore", 6099278090051958028L);
        setLongField(term3173332, term3173332.getClass(), "sumTechMasterHighScore", 1381112143385371560L);
        setLongField(term3173332, term3173332.getClass(), "sumTechLunaticHighScore", 9142017189663223897L);
        setLongField(term3173332, term3173332.getClass(), "sumBattleHighScore", 997594927238132837L);
        setLongField(term3173332, term3173332.getClass(), "sumBattleBasicHighScore", 4535131166251255122L);
        setLongField(term3173332, term3173332.getClass(), "sumBattleAdvancedHighScore", 2456421457877689512L);
        setLongField(term3173332, term3173332.getClass(), "sumBattleExpertHighScore", -4328756129405147496L);
        setLongField(term3173332, term3173332.getClass(), "sumBattleMasterHighScore", 496544849862211644L);
        setLongField(term3173332, term3173332.getClass(), "sumBattleLunaticHighScore", -5341024174307163577L);
        setField(term3173332, term3173332.getClass(), "eventWatchedDate", "RthToplzyl");
        setField(term3173332, term3173332.getClass(), "cmEventWatchedDate", "dtMQwKyunY");
        setField(term3173332, term3173332.getClass(), "firstGameId", "BKuyCiFqcd");
        setField(term3173332, term3173332.getClass(), "firstRomVersion", "JwjNxUNEwR");
        setField(term3173332, term3173332.getClass(), "firstDataVersion", "ephtZPJIll");
        setField(term3173332, term3173332.getClass(), "firstPlayDate", "tcOawTWlJw");
        setField(term3173332, term3173332.getClass(), "lastGameId", "QaQBIUWiDy");
        setField(term3173332, term3173332.getClass(), "lastRomVersion", "zkPlClILsA");
        setField(term3173332, term3173332.getClass(), "lastDataVersion", "SGfVvQFmor");
        setField(term3173332, term3173332.getClass(), "compatibleCmVersion", "uVwOahtaBF");
        setField(term3173332, term3173332.getClass(), "lastPlayDate", "UBOQztTwGg");
        setIntField(term3173332, term3173332.getClass(), "lastPlaceId", -1010895285);
        setField(term3173332, term3173332.getClass(), "lastPlaceName", "fiwjQmEwkg");
        setIntField(term3173332, term3173332.getClass(), "lastRegionId", 1725046869);
        setField(term3173332, term3173332.getClass(), "lastRegionName", "snXuVJISFA");
        setIntField(term3173332, term3173332.getClass(), "lastAllNetId", 1215872189);
        setField(term3173332, term3173332.getClass(), "lastClientId", "ZEqHZuwJeQ");
        setIntField(term3173332, term3173332.getClass(), "lastUsedDeckId", 1414563032);
        setIntField(term3173332, term3173332.getClass(), "lastPlayMusicLevel", 1231786682);
        setIntField(term3173332, term3173332.getClass(), "lastEmoneyBrand", -1156684827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTabSortSetting", argTypes, term3173332, args);
    }

};


