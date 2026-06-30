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

public class UserTrainingRoom_canEqual_41590898214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19955;
     Object term20246;

    public UserTrainingRoom_canEqual_41590898214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19961 = new Long(-7612550318181586304L);
        term19955 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term19957 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term19959 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19980 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19990 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term19955, term19955.getClass(), "id", -6151316713456472560L);
        setLongField(term19957, term19957.getClass(), "id", -5597498165246748176L);
        setLongField(term19959, term19959.getClass(), "id", 6174523862926526279L);
        setField(term19959, term19959.getClass(), "extId", term19961);
        setField(term19959, term19959.getClass(), "luid", "YcTbglHiUq");
        setIntField(term19976, term19976.getClass(), "year", 2013);
        setShortField(term19976, term19976.getClass(), "month", (short) 5);
        setShortField(term19976, term19976.getClass(), "day", (short) 9);
        setField(term19975, term19975.getClass(), "date", term19976);
        setByteField(term19980, term19980.getClass(), "hour", (byte) 4);
        setByteField(term19980, term19980.getClass(), "minute", (byte) 18);
        setByteField(term19980, term19980.getClass(), "second", (byte) 35);
        setIntField(term19980, term19980.getClass(), "nano", 909079395);
        setField(term19975, term19975.getClass(), "time", term19980);
        setField(term19959, term19959.getClass(), "registerTime", term19975);
        setIntField(term19986, term19986.getClass(), "year", 2015);
        setShortField(term19986, term19986.getClass(), "month", (short) 3);
        setShortField(term19986, term19986.getClass(), "day", (short) 15);
        setField(term19985, term19985.getClass(), "date", term19986);
        setByteField(term19990, term19990.getClass(), "hour", (byte) 8);
        setByteField(term19990, term19990.getClass(), "minute", (byte) 45);
        setByteField(term19990, term19990.getClass(), "second", (byte) 29);
        setIntField(term19990, term19990.getClass(), "nano", 781486470);
        setField(term19985, term19985.getClass(), "time", term19990);
        setField(term19959, term19959.getClass(), "accessTime", term19985);
        setField(term19957, term19957.getClass(), "card", term19959);
        setField(term19957, term19957.getClass(), "userName", "TiUqHrjoEU");
        setIntField(term19957, term19957.getClass(), "level", -91240911);
        setIntField(term19957, term19957.getClass(), "reincarnationNum", -321227954);
        setLongField(term19957, term19957.getClass(), "exp", 4977537501907213732L);
        setLongField(term19957, term19957.getClass(), "point", -2341942457089205755L);
        setLongField(term19957, term19957.getClass(), "totalPoint", -7503147844796296300L);
        setIntField(term19957, term19957.getClass(), "playCount", 373810833);
        setIntField(term19957, term19957.getClass(), "jewelCount", -215979293);
        setIntField(term19957, term19957.getClass(), "totalJewelCount", -19567889);
        setIntField(term19957, term19957.getClass(), "medalCount", 693500318);
        setIntField(term19957, term19957.getClass(), "playerRating", 1702404702);
        setIntField(term19957, term19957.getClass(), "highestRating", 1141592999);
        setIntField(term19957, term19957.getClass(), "battlePoint", 848113442);
        setIntField(term19957, term19957.getClass(), "bestBattlePoint", 793974213);
        setIntField(term19957, term19957.getClass(), "overDamageBattlePoint", 722546287);
        setBooleanField(term19957, term19957.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term19957, term19957.getClass(), "nameplateId", -2060284160);
        setIntField(term19957, term19957.getClass(), "trophyId", -568450686);
        setIntField(term19957, term19957.getClass(), "cardId", 1314660281);
        setIntField(term19957, term19957.getClass(), "characterId", -126399768);
        setIntField(term19957, term19957.getClass(), "characterVoiceNo", 318982923);
        setIntField(term19957, term19957.getClass(), "tabSetting", -154210001);
        setIntField(term19957, term19957.getClass(), "tabSortSetting", 621910137);
        setIntField(term19957, term19957.getClass(), "cardCategorySetting", 241533020);
        setIntField(term19957, term19957.getClass(), "cardSortSetting", 2081679151);
        setIntField(term19957, term19957.getClass(), "rivalScoreCategorySetting", -1030167086);
        setIntField(term19957, term19957.getClass(), "playedTutorialBit", -434230943);
        setIntField(term19957, term19957.getClass(), "firstTutorialCancelNum", 698633875);
        setLongField(term19957, term19957.getClass(), "sumTechHighScore", 1099634235456795888L);
        setLongField(term19957, term19957.getClass(), "sumTechBasicHighScore", 5391189846186870864L);
        setLongField(term19957, term19957.getClass(), "sumTechAdvancedHighScore", 7314774835988078404L);
        setLongField(term19957, term19957.getClass(), "sumTechExpertHighScore", 2777168805269959396L);
        setLongField(term19957, term19957.getClass(), "sumTechMasterHighScore", 5255768275907389358L);
        setLongField(term19957, term19957.getClass(), "sumTechLunaticHighScore", -8859332911664940963L);
        setLongField(term19957, term19957.getClass(), "sumBattleHighScore", 7048544371106200955L);
        setLongField(term19957, term19957.getClass(), "sumBattleBasicHighScore", -6299955839293054069L);
        setLongField(term19957, term19957.getClass(), "sumBattleAdvancedHighScore", 3573273176206440433L);
        setLongField(term19957, term19957.getClass(), "sumBattleExpertHighScore", 8242382965219431687L);
        setLongField(term19957, term19957.getClass(), "sumBattleMasterHighScore", -3092537062189928451L);
        setLongField(term19957, term19957.getClass(), "sumBattleLunaticHighScore", -6645699856048951433L);
        setField(term19957, term19957.getClass(), "eventWatchedDate", "eoEvZbdLjL");
        setField(term19957, term19957.getClass(), "cmEventWatchedDate", "BkIxsyPkGy");
        setField(term19957, term19957.getClass(), "firstGameId", "mrMGwoRgVY");
        setField(term19957, term19957.getClass(), "firstRomVersion", "mxVLTgCwki");
        setField(term19957, term19957.getClass(), "firstDataVersion", "wCurppnDSA");
        setField(term19957, term19957.getClass(), "firstPlayDate", "JydxSNTMYt");
        setField(term19957, term19957.getClass(), "lastGameId", "KpurAcrHYT");
        setField(term19957, term19957.getClass(), "lastRomVersion", "QjvDwgKJGz");
        setField(term19957, term19957.getClass(), "lastDataVersion", "ngYxiXTZrk");
        setField(term19957, term19957.getClass(), "compatibleCmVersion", "YTxBqWRAlo");
        setField(term19957, term19957.getClass(), "lastPlayDate", "ReruUQRXwl");
        setIntField(term19957, term19957.getClass(), "lastPlaceId", 548468113);
        setField(term19957, term19957.getClass(), "lastPlaceName", "DWEsVQwuaE");
        setIntField(term19957, term19957.getClass(), "lastRegionId", 1701819905);
        setField(term19957, term19957.getClass(), "lastRegionName", "qGkNzZAeDN");
        setIntField(term19957, term19957.getClass(), "lastAllNetId", 1721418943);
        setField(term19957, term19957.getClass(), "lastClientId", "wdtiuPgTVJ");
        setIntField(term19957, term19957.getClass(), "lastUsedDeckId", -111082612);
        setIntField(term19957, term19957.getClass(), "lastPlayMusicLevel", 1253334988);
        setIntField(term19957, term19957.getClass(), "lastEmoneyBrand", 1086709736);
        setField(term19955, term19955.getClass(), "user", term19957);
        setField(term19955, term19955.getClass(), "authKey", "HUgzMgrpsK");
        setIntField(term19955, term19955.getClass(), "roomId", -1606698075);
        setIntField(term19955, term19955.getClass(), "cardId", 90996421);
        setField(term19955, term19955.getClass(), "valueDate", "ubaBUfLolu");
        term20246 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20246;
        callMethod(klass, "canEqual", argTypes, term19955, args);
    }

};


