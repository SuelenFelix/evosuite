package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserMissionPoint_getUser_20330381382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7318;

    public UserMissionPoint_getUser_20330381382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7324 = new Long(5127676408959197577L);
        term7318 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term7320 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term7322 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term7338 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7339 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7343 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7348 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7349 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7353 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term7318, term7318.getClass(), "id", -3130003589475815807L);
        setLongField(term7320, term7320.getClass(), "id", -5344598381371854750L);
        setLongField(term7322, term7322.getClass(), "id", -3718250311794019732L);
        setField(term7322, term7322.getClass(), "extId", term7324);
        setField(term7322, term7322.getClass(), "luid", "GBOEuByOfr");
        setIntField(term7339, term7339.getClass(), "year", 2010);
        setShortField(term7339, term7339.getClass(), "month", (short) 5);
        setShortField(term7339, term7339.getClass(), "day", (short) 2);
        setField(term7338, term7338.getClass(), "date", term7339);
        setByteField(term7343, term7343.getClass(), "hour", (byte) 2);
        setByteField(term7343, term7343.getClass(), "minute", (byte) 22);
        setByteField(term7343, term7343.getClass(), "second", (byte) 33);
        setIntField(term7343, term7343.getClass(), "nano", 530835039);
        setField(term7338, term7338.getClass(), "time", term7343);
        setField(term7322, term7322.getClass(), "registerTime", term7338);
        setIntField(term7349, term7349.getClass(), "year", 2024);
        setShortField(term7349, term7349.getClass(), "month", (short) 4);
        setShortField(term7349, term7349.getClass(), "day", (short) 24);
        setField(term7348, term7348.getClass(), "date", term7349);
        setByteField(term7353, term7353.getClass(), "hour", (byte) 7);
        setByteField(term7353, term7353.getClass(), "minute", (byte) 2);
        setByteField(term7353, term7353.getClass(), "second", (byte) 51);
        setIntField(term7353, term7353.getClass(), "nano", 635502964);
        setField(term7348, term7348.getClass(), "time", term7353);
        setField(term7322, term7322.getClass(), "accessTime", term7348);
        setField(term7320, term7320.getClass(), "card", term7322);
        setField(term7320, term7320.getClass(), "userName", "NHbOFFjyVK");
        setIntField(term7320, term7320.getClass(), "level", -695279311);
        setIntField(term7320, term7320.getClass(), "reincarnationNum", 114279242);
        setLongField(term7320, term7320.getClass(), "exp", -5935517391653614345L);
        setLongField(term7320, term7320.getClass(), "point", -6521561238735301071L);
        setLongField(term7320, term7320.getClass(), "totalPoint", -6609679920238945303L);
        setIntField(term7320, term7320.getClass(), "playCount", 990883365);
        setIntField(term7320, term7320.getClass(), "jewelCount", 633598642);
        setIntField(term7320, term7320.getClass(), "totalJewelCount", 1862841859);
        setIntField(term7320, term7320.getClass(), "medalCount", -1114668574);
        setIntField(term7320, term7320.getClass(), "playerRating", 514511037);
        setIntField(term7320, term7320.getClass(), "highestRating", 1713573821);
        setIntField(term7320, term7320.getClass(), "battlePoint", 1956590498);
        setIntField(term7320, term7320.getClass(), "bestBattlePoint", 1467356494);
        setIntField(term7320, term7320.getClass(), "overDamageBattlePoint", -26316536);
        setBooleanField(term7320, term7320.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term7320, term7320.getClass(), "nameplateId", 1716165145);
        setIntField(term7320, term7320.getClass(), "trophyId", 1692937831);
        setIntField(term7320, term7320.getClass(), "cardId", -1539747985);
        setIntField(term7320, term7320.getClass(), "characterId", -1982489643);
        setIntField(term7320, term7320.getClass(), "characterVoiceNo", 550892835);
        setIntField(term7320, term7320.getClass(), "tabSetting", 1237549886);
        setIntField(term7320, term7320.getClass(), "tabSortSetting", -1945635750);
        setIntField(term7320, term7320.getClass(), "cardCategorySetting", -1622760744);
        setIntField(term7320, term7320.getClass(), "cardSortSetting", 2068435279);
        setIntField(term7320, term7320.getClass(), "rivalScoreCategorySetting", -1556527718);
        setIntField(term7320, term7320.getClass(), "playedTutorialBit", 895255351);
        setIntField(term7320, term7320.getClass(), "firstTutorialCancelNum", -1317044799);
        setLongField(term7320, term7320.getClass(), "sumTechHighScore", -7296330380944173376L);
        setLongField(term7320, term7320.getClass(), "sumTechBasicHighScore", -8890284990655172580L);
        setLongField(term7320, term7320.getClass(), "sumTechAdvancedHighScore", -5951743062322506095L);
        setLongField(term7320, term7320.getClass(), "sumTechExpertHighScore", 768144790810175653L);
        setLongField(term7320, term7320.getClass(), "sumTechMasterHighScore", -1497280900081695731L);
        setLongField(term7320, term7320.getClass(), "sumTechLunaticHighScore", -3602825674339018793L);
        setLongField(term7320, term7320.getClass(), "sumBattleHighScore", 3086974592680165932L);
        setLongField(term7320, term7320.getClass(), "sumBattleBasicHighScore", -532956263280568707L);
        setLongField(term7320, term7320.getClass(), "sumBattleAdvancedHighScore", 6073193746616629086L);
        setLongField(term7320, term7320.getClass(), "sumBattleExpertHighScore", -2463629530824341661L);
        setLongField(term7320, term7320.getClass(), "sumBattleMasterHighScore", 7800835025296877231L);
        setLongField(term7320, term7320.getClass(), "sumBattleLunaticHighScore", -187772971269812453L);
        setField(term7320, term7320.getClass(), "eventWatchedDate", "zaloBqlrSo");
        setField(term7320, term7320.getClass(), "cmEventWatchedDate", "vvoLrMGCoN");
        setField(term7320, term7320.getClass(), "firstGameId", "pXdglvyrQe");
        setField(term7320, term7320.getClass(), "firstRomVersion", "OcfNzHYdki");
        setField(term7320, term7320.getClass(), "firstDataVersion", "uPuCVuZYOI");
        setField(term7320, term7320.getClass(), "firstPlayDate", "TweMFhxNdj");
        setField(term7320, term7320.getClass(), "lastGameId", "NBrvVzvQHe");
        setField(term7320, term7320.getClass(), "lastRomVersion", "FjOiNAfBOc");
        setField(term7320, term7320.getClass(), "lastDataVersion", "iCCsaLHohG");
        setField(term7320, term7320.getClass(), "compatibleCmVersion", "NJhGgctbdj");
        setField(term7320, term7320.getClass(), "lastPlayDate", "MYWYUeLGOp");
        setIntField(term7320, term7320.getClass(), "lastPlaceId", -1428063820);
        setField(term7320, term7320.getClass(), "lastPlaceName", "tsTGdgQYUL");
        setIntField(term7320, term7320.getClass(), "lastRegionId", -1271375703);
        setField(term7320, term7320.getClass(), "lastRegionName", "TtGbVmKcnX");
        setIntField(term7320, term7320.getClass(), "lastAllNetId", 1136208236);
        setField(term7320, term7320.getClass(), "lastClientId", "GJVkUrCVdD");
        setIntField(term7320, term7320.getClass(), "lastUsedDeckId", -1220630391);
        setIntField(term7320, term7320.getClass(), "lastPlayMusicLevel", -995822131);
        setIntField(term7320, term7320.getClass(), "lastEmoneyBrand", -687282231);
        setField(term7318, term7318.getClass(), "user", term7320);
        setIntField(term7318, term7318.getClass(), "eventId", 1200440315);
        setLongField(term7318, term7318.getClass(), "point", 468487103823886117L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term7318, args);
    }

};


