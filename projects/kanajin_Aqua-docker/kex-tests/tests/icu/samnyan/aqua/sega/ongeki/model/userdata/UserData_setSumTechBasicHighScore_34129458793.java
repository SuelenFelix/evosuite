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

public class UserData_setSumTechBasicHighScore_34129458793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61383;
     Object term61646;

    public UserData_setSumTechBasicHighScore_34129458793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term61387 = new Long(-3948863953565024517L);
        term61383 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term61385 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term61401 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61402 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61406 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61416 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term61383, term61383.getClass(), "id", -6291199733750478460L);
        setLongField(term61385, term61385.getClass(), "id", -2741343132217000981L);
        setField(term61385, term61385.getClass(), "extId", term61387);
        setField(term61385, term61385.getClass(), "luid", "pZrAdSHQIs");
        setIntField(term61402, term61402.getClass(), "year", 2023);
        setShortField(term61402, term61402.getClass(), "month", (short) 11);
        setShortField(term61402, term61402.getClass(), "day", (short) 8);
        setField(term61401, term61401.getClass(), "date", term61402);
        setByteField(term61406, term61406.getClass(), "hour", (byte) 21);
        setByteField(term61406, term61406.getClass(), "minute", (byte) 57);
        setByteField(term61406, term61406.getClass(), "second", (byte) 28);
        setIntField(term61406, term61406.getClass(), "nano", 426944685);
        setField(term61401, term61401.getClass(), "time", term61406);
        setField(term61385, term61385.getClass(), "registerTime", term61401);
        setIntField(term61412, term61412.getClass(), "year", 2020);
        setShortField(term61412, term61412.getClass(), "month", (short) 9);
        setShortField(term61412, term61412.getClass(), "day", (short) 2);
        setField(term61411, term61411.getClass(), "date", term61412);
        setByteField(term61416, term61416.getClass(), "hour", (byte) 17);
        setByteField(term61416, term61416.getClass(), "minute", (byte) 47);
        setByteField(term61416, term61416.getClass(), "second", (byte) 32);
        setIntField(term61416, term61416.getClass(), "nano", 161829485);
        setField(term61411, term61411.getClass(), "time", term61416);
        setField(term61385, term61385.getClass(), "accessTime", term61411);
        setField(term61383, term61383.getClass(), "card", term61385);
        setField(term61383, term61383.getClass(), "userName", "XTOiucaEva");
        setIntField(term61383, term61383.getClass(), "level", 1979269463);
        setIntField(term61383, term61383.getClass(), "reincarnationNum", -1690818607);
        setLongField(term61383, term61383.getClass(), "exp", 7025673372898881791L);
        setLongField(term61383, term61383.getClass(), "point", -485047365970365138L);
        setLongField(term61383, term61383.getClass(), "totalPoint", 15712350410058172L);
        setIntField(term61383, term61383.getClass(), "playCount", 252440319);
        setIntField(term61383, term61383.getClass(), "jewelCount", -1798089143);
        setIntField(term61383, term61383.getClass(), "totalJewelCount", -2056399026);
        setIntField(term61383, term61383.getClass(), "medalCount", -150070327);
        setIntField(term61383, term61383.getClass(), "playerRating", -731659931);
        setIntField(term61383, term61383.getClass(), "highestRating", 645238162);
        setIntField(term61383, term61383.getClass(), "battlePoint", -987757870);
        setIntField(term61383, term61383.getClass(), "bestBattlePoint", 2132585005);
        setIntField(term61383, term61383.getClass(), "overDamageBattlePoint", 451557051);
        setBooleanField(term61383, term61383.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term61383, term61383.getClass(), "nameplateId", 71783796);
        setIntField(term61383, term61383.getClass(), "trophyId", 2085417929);
        setIntField(term61383, term61383.getClass(), "cardId", 644887242);
        setIntField(term61383, term61383.getClass(), "characterId", 1544325432);
        setIntField(term61383, term61383.getClass(), "characterVoiceNo", 908157389);
        setIntField(term61383, term61383.getClass(), "tabSetting", 691619263);
        setIntField(term61383, term61383.getClass(), "tabSortSetting", 637841150);
        setIntField(term61383, term61383.getClass(), "cardCategorySetting", 1599041316);
        setIntField(term61383, term61383.getClass(), "cardSortSetting", 1478113587);
        setIntField(term61383, term61383.getClass(), "rivalScoreCategorySetting", 1580986308);
        setIntField(term61383, term61383.getClass(), "playedTutorialBit", -870011438);
        setIntField(term61383, term61383.getClass(), "firstTutorialCancelNum", -1767217325);
        setLongField(term61383, term61383.getClass(), "sumTechHighScore", 89350465134424270L);
        setLongField(term61383, term61383.getClass(), "sumTechBasicHighScore", -7030038452195949121L);
        setLongField(term61383, term61383.getClass(), "sumTechAdvancedHighScore", 4415806668447757000L);
        setLongField(term61383, term61383.getClass(), "sumTechExpertHighScore", -2500203677269123718L);
        setLongField(term61383, term61383.getClass(), "sumTechMasterHighScore", 3008581308971566501L);
        setLongField(term61383, term61383.getClass(), "sumTechLunaticHighScore", -8028700724672913769L);
        setLongField(term61383, term61383.getClass(), "sumBattleHighScore", 4968282128824824030L);
        setLongField(term61383, term61383.getClass(), "sumBattleBasicHighScore", 8639639803357659892L);
        setLongField(term61383, term61383.getClass(), "sumBattleAdvancedHighScore", -6699045864427523717L);
        setLongField(term61383, term61383.getClass(), "sumBattleExpertHighScore", -8801341388592368658L);
        setLongField(term61383, term61383.getClass(), "sumBattleMasterHighScore", 6916415397024602364L);
        setLongField(term61383, term61383.getClass(), "sumBattleLunaticHighScore", 3958291965587234274L);
        setField(term61383, term61383.getClass(), "eventWatchedDate", "JMekRNxFMU");
        setField(term61383, term61383.getClass(), "cmEventWatchedDate", "LBNEEquiet");
        setField(term61383, term61383.getClass(), "firstGameId", "cBMdxJirJj");
        setField(term61383, term61383.getClass(), "firstRomVersion", "kVnxgkemHF");
        setField(term61383, term61383.getClass(), "firstDataVersion", "JUQnEoujef");
        setField(term61383, term61383.getClass(), "firstPlayDate", "riXARUiigm");
        setField(term61383, term61383.getClass(), "lastGameId", "RbXhBDZbRT");
        setField(term61383, term61383.getClass(), "lastRomVersion", "QDaTqkWnGj");
        setField(term61383, term61383.getClass(), "lastDataVersion", "vNObzQvzxo");
        setField(term61383, term61383.getClass(), "compatibleCmVersion", "uyuWzXeJvn");
        setField(term61383, term61383.getClass(), "lastPlayDate", "jvQHxWAYDO");
        setIntField(term61383, term61383.getClass(), "lastPlaceId", -170630873);
        setField(term61383, term61383.getClass(), "lastPlaceName", "mntnLPfhte");
        setIntField(term61383, term61383.getClass(), "lastRegionId", -1246900588);
        setField(term61383, term61383.getClass(), "lastRegionName", "rIKLUjcdnZ");
        setIntField(term61383, term61383.getClass(), "lastAllNetId", 548633933);
        setField(term61383, term61383.getClass(), "lastClientId", "MQaKKukkYD");
        setIntField(term61383, term61383.getClass(), "lastUsedDeckId", -1532179986);
        setIntField(term61383, term61383.getClass(), "lastPlayMusicLevel", 1644599689);
        setIntField(term61383, term61383.getClass(), "lastEmoneyBrand", 1665477880);
        term61646 = new Long(3506568970076223101L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term61646;
        callMethod(klass, "setSumTechBasicHighScore", argTypes, term61383, args);
    }

};


