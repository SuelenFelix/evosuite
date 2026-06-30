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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class UserBoss_init_197934585618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141449;
     Object term141451;
     Object term141714;
     Object term141716;
     Object term141718;
     Object term141720;

    public UserBoss_init_197934585618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141449 = new Long(5264134464387947887L);
        Long term141455 = new Long(4689907154423223972L);
        term141451 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term141453 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term141469 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141474 = newInstance(Class.forName("java.time.LocalTime"));
        Object term141479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term141480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term141484 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term141451, term141451.getClass(), "id", -1081832638729609488L);
        setLongField(term141453, term141453.getClass(), "id", -1847156724255643126L);
        setField(term141453, term141453.getClass(), "extId", term141455);
        setField(term141453, term141453.getClass(), "luid", "SrhlGLISlG");
        setIntField(term141470, term141470.getClass(), "year", 2022);
        setShortField(term141470, term141470.getClass(), "month", (short) 10);
        setShortField(term141470, term141470.getClass(), "day", (short) 1);
        setField(term141469, term141469.getClass(), "date", term141470);
        setByteField(term141474, term141474.getClass(), "hour", (byte) 0);
        setByteField(term141474, term141474.getClass(), "minute", (byte) 56);
        setByteField(term141474, term141474.getClass(), "second", (byte) 38);
        setIntField(term141474, term141474.getClass(), "nano", 320635849);
        setField(term141469, term141469.getClass(), "time", term141474);
        setField(term141453, term141453.getClass(), "registerTime", term141469);
        setIntField(term141480, term141480.getClass(), "year", 2028);
        setShortField(term141480, term141480.getClass(), "month", (short) 4);
        setShortField(term141480, term141480.getClass(), "day", (short) 9);
        setField(term141479, term141479.getClass(), "date", term141480);
        setByteField(term141484, term141484.getClass(), "hour", (byte) 15);
        setByteField(term141484, term141484.getClass(), "minute", (byte) 32);
        setByteField(term141484, term141484.getClass(), "second", (byte) 25);
        setIntField(term141484, term141484.getClass(), "nano", 604005925);
        setField(term141479, term141479.getClass(), "time", term141484);
        setField(term141453, term141453.getClass(), "accessTime", term141479);
        setField(term141451, term141451.getClass(), "card", term141453);
        setField(term141451, term141451.getClass(), "userName", "UPhCxQiSer");
        setIntField(term141451, term141451.getClass(), "level", -984536386);
        setIntField(term141451, term141451.getClass(), "reincarnationNum", -394673031);
        setLongField(term141451, term141451.getClass(), "exp", -4530490045178009540L);
        setLongField(term141451, term141451.getClass(), "point", -624018229871560240L);
        setLongField(term141451, term141451.getClass(), "totalPoint", -3611897026570191715L);
        setIntField(term141451, term141451.getClass(), "playCount", -2114266331);
        setIntField(term141451, term141451.getClass(), "jewelCount", 1060512544);
        setIntField(term141451, term141451.getClass(), "totalJewelCount", 733910191);
        setIntField(term141451, term141451.getClass(), "medalCount", -1299247390);
        setIntField(term141451, term141451.getClass(), "playerRating", 901132234);
        setIntField(term141451, term141451.getClass(), "highestRating", -205835456);
        setIntField(term141451, term141451.getClass(), "battlePoint", 889992615);
        setIntField(term141451, term141451.getClass(), "bestBattlePoint", 1184212871);
        setIntField(term141451, term141451.getClass(), "overDamageBattlePoint", 1318633291);
        setBooleanField(term141451, term141451.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term141451, term141451.getClass(), "nameplateId", 163521915);
        setIntField(term141451, term141451.getClass(), "trophyId", 208383602);
        setIntField(term141451, term141451.getClass(), "cardId", -936623097);
        setIntField(term141451, term141451.getClass(), "characterId", -1148000466);
        setIntField(term141451, term141451.getClass(), "characterVoiceNo", 1299330727);
        setIntField(term141451, term141451.getClass(), "tabSetting", 1541672801);
        setIntField(term141451, term141451.getClass(), "tabSortSetting", -1723354196);
        setIntField(term141451, term141451.getClass(), "cardCategorySetting", -19725944);
        setIntField(term141451, term141451.getClass(), "cardSortSetting", 432916102);
        setIntField(term141451, term141451.getClass(), "rivalScoreCategorySetting", -1059151250);
        setIntField(term141451, term141451.getClass(), "playedTutorialBit", 150030523);
        setIntField(term141451, term141451.getClass(), "firstTutorialCancelNum", -1729514045);
        setLongField(term141451, term141451.getClass(), "sumTechHighScore", 4112096392775762550L);
        setLongField(term141451, term141451.getClass(), "sumTechBasicHighScore", 6972487325391765808L);
        setLongField(term141451, term141451.getClass(), "sumTechAdvancedHighScore", -327329497419785104L);
        setLongField(term141451, term141451.getClass(), "sumTechExpertHighScore", 6642597445094558106L);
        setLongField(term141451, term141451.getClass(), "sumTechMasterHighScore", -1035525992612329322L);
        setLongField(term141451, term141451.getClass(), "sumTechLunaticHighScore", 4368516079374831693L);
        setLongField(term141451, term141451.getClass(), "sumBattleHighScore", -7252448698647139323L);
        setLongField(term141451, term141451.getClass(), "sumBattleBasicHighScore", 4254836848057675530L);
        setLongField(term141451, term141451.getClass(), "sumBattleAdvancedHighScore", 6206528448494020163L);
        setLongField(term141451, term141451.getClass(), "sumBattleExpertHighScore", -3830194845459293274L);
        setLongField(term141451, term141451.getClass(), "sumBattleMasterHighScore", -7060894407299258970L);
        setLongField(term141451, term141451.getClass(), "sumBattleLunaticHighScore", 8896386042201451792L);
        setField(term141451, term141451.getClass(), "eventWatchedDate", "jHjQEFLfrD");
        setField(term141451, term141451.getClass(), "cmEventWatchedDate", "jDgLTvGduh");
        setField(term141451, term141451.getClass(), "firstGameId", "HfgMTpkgaK");
        setField(term141451, term141451.getClass(), "firstRomVersion", "QUAzjGTSxv");
        setField(term141451, term141451.getClass(), "firstDataVersion", "cIWnHZgAhI");
        setField(term141451, term141451.getClass(), "firstPlayDate", "vEHRRwNajA");
        setField(term141451, term141451.getClass(), "lastGameId", "JePWfnKmqE");
        setField(term141451, term141451.getClass(), "lastRomVersion", "eoNrxoHMqo");
        setField(term141451, term141451.getClass(), "lastDataVersion", "klaJiaCEJi");
        setField(term141451, term141451.getClass(), "compatibleCmVersion", "gcfVossSeW");
        setField(term141451, term141451.getClass(), "lastPlayDate", "xBlXstmAsQ");
        setIntField(term141451, term141451.getClass(), "lastPlaceId", 72012599);
        setField(term141451, term141451.getClass(), "lastPlaceName", "jewrbmDdcT");
        setIntField(term141451, term141451.getClass(), "lastRegionId", 1119073188);
        setField(term141451, term141451.getClass(), "lastRegionName", "ltNoNMOfWV");
        setIntField(term141451, term141451.getClass(), "lastAllNetId", -1116601587);
        setField(term141451, term141451.getClass(), "lastClientId", "VgdfvIeVod");
        setIntField(term141451, term141451.getClass(), "lastUsedDeckId", -1646521952);
        setIntField(term141451, term141451.getClass(), "lastPlayMusicLevel", 532690926);
        setIntField(term141451, term141451.getClass(), "lastEmoneyBrand", 1569782717);
        term141714 = new Integer(-479375394);
        term141716 = new Integer(2068819583);
        term141718 = new Boolean(false);
        term141720 = new Integer(1499046631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term141449;
        args[1] = term141451;
        args[2] = term141714;
        args[3] = term141716;
        args[4] = term141718;
        args[5] = term141720;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


