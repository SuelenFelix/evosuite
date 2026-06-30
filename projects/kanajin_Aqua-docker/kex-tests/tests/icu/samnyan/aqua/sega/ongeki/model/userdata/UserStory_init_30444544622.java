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

public class UserStory_init_30444544622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167116;
     Object term167118;
     Object term167381;
     Object term167383;
     Object term167385;
     Object term167387;
     Object term167389;
     Object term167391;

    public UserStory_init_30444544622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167116 = new Long(5737078000461135622L);
        Long term167122 = new Long(1740732617708040141L);
        term167118 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term167120 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term167136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167141 = newInstance(Class.forName("java.time.LocalTime"));
        Object term167146 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167147 = newInstance(Class.forName("java.time.LocalDate"));
        Object term167151 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term167118, term167118.getClass(), "id", -6039686681211056155L);
        setLongField(term167120, term167120.getClass(), "id", 1885391251428799555L);
        setField(term167120, term167120.getClass(), "extId", term167122);
        setField(term167120, term167120.getClass(), "luid", "hNGAMuzptC");
        setIntField(term167137, term167137.getClass(), "year", 2013);
        setShortField(term167137, term167137.getClass(), "month", (short) 6);
        setShortField(term167137, term167137.getClass(), "day", (short) 2);
        setField(term167136, term167136.getClass(), "date", term167137);
        setByteField(term167141, term167141.getClass(), "hour", (byte) 6);
        setByteField(term167141, term167141.getClass(), "minute", (byte) 13);
        setByteField(term167141, term167141.getClass(), "second", (byte) 6);
        setIntField(term167141, term167141.getClass(), "nano", 466304404);
        setField(term167136, term167136.getClass(), "time", term167141);
        setField(term167120, term167120.getClass(), "registerTime", term167136);
        setIntField(term167147, term167147.getClass(), "year", 2022);
        setShortField(term167147, term167147.getClass(), "month", (short) 4);
        setShortField(term167147, term167147.getClass(), "day", (short) 10);
        setField(term167146, term167146.getClass(), "date", term167147);
        setByteField(term167151, term167151.getClass(), "hour", (byte) 5);
        setByteField(term167151, term167151.getClass(), "minute", (byte) 55);
        setByteField(term167151, term167151.getClass(), "second", (byte) 27);
        setIntField(term167151, term167151.getClass(), "nano", 974485423);
        setField(term167146, term167146.getClass(), "time", term167151);
        setField(term167120, term167120.getClass(), "accessTime", term167146);
        setField(term167118, term167118.getClass(), "card", term167120);
        setField(term167118, term167118.getClass(), "userName", "oJkataxIMU");
        setIntField(term167118, term167118.getClass(), "level", -269402208);
        setIntField(term167118, term167118.getClass(), "reincarnationNum", 714123083);
        setLongField(term167118, term167118.getClass(), "exp", 1036262200586004233L);
        setLongField(term167118, term167118.getClass(), "point", -8209613851123558072L);
        setLongField(term167118, term167118.getClass(), "totalPoint", -8531264660522466654L);
        setIntField(term167118, term167118.getClass(), "playCount", -1608554992);
        setIntField(term167118, term167118.getClass(), "jewelCount", -174955872);
        setIntField(term167118, term167118.getClass(), "totalJewelCount", 1429537897);
        setIntField(term167118, term167118.getClass(), "medalCount", 216290703);
        setIntField(term167118, term167118.getClass(), "playerRating", -294229148);
        setIntField(term167118, term167118.getClass(), "highestRating", -1249763145);
        setIntField(term167118, term167118.getClass(), "battlePoint", -1872599962);
        setIntField(term167118, term167118.getClass(), "bestBattlePoint", 1889574494);
        setIntField(term167118, term167118.getClass(), "overDamageBattlePoint", -687378216);
        setBooleanField(term167118, term167118.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term167118, term167118.getClass(), "nameplateId", -1552077299);
        setIntField(term167118, term167118.getClass(), "trophyId", 2020615916);
        setIntField(term167118, term167118.getClass(), "cardId", -542896303);
        setIntField(term167118, term167118.getClass(), "characterId", 1175522239);
        setIntField(term167118, term167118.getClass(), "characterVoiceNo", -1316810397);
        setIntField(term167118, term167118.getClass(), "tabSetting", -904376067);
        setIntField(term167118, term167118.getClass(), "tabSortSetting", 1501300402);
        setIntField(term167118, term167118.getClass(), "cardCategorySetting", -1415123866);
        setIntField(term167118, term167118.getClass(), "cardSortSetting", -840575313);
        setIntField(term167118, term167118.getClass(), "rivalScoreCategorySetting", 1369614831);
        setIntField(term167118, term167118.getClass(), "playedTutorialBit", -1862630065);
        setIntField(term167118, term167118.getClass(), "firstTutorialCancelNum", 376483156);
        setLongField(term167118, term167118.getClass(), "sumTechHighScore", -822573573543723810L);
        setLongField(term167118, term167118.getClass(), "sumTechBasicHighScore", -6776297669899514549L);
        setLongField(term167118, term167118.getClass(), "sumTechAdvancedHighScore", -3190410552642755877L);
        setLongField(term167118, term167118.getClass(), "sumTechExpertHighScore", -4625786793010778588L);
        setLongField(term167118, term167118.getClass(), "sumTechMasterHighScore", -7808326957899833180L);
        setLongField(term167118, term167118.getClass(), "sumTechLunaticHighScore", 7950277824110748410L);
        setLongField(term167118, term167118.getClass(), "sumBattleHighScore", 2614053727229115891L);
        setLongField(term167118, term167118.getClass(), "sumBattleBasicHighScore", -9113146244420462428L);
        setLongField(term167118, term167118.getClass(), "sumBattleAdvancedHighScore", -601952985266627110L);
        setLongField(term167118, term167118.getClass(), "sumBattleExpertHighScore", 4546898761125225903L);
        setLongField(term167118, term167118.getClass(), "sumBattleMasterHighScore", 2572918340045009928L);
        setLongField(term167118, term167118.getClass(), "sumBattleLunaticHighScore", 6439867665349593917L);
        setField(term167118, term167118.getClass(), "eventWatchedDate", "vRLnmEEamN");
        setField(term167118, term167118.getClass(), "cmEventWatchedDate", "NYuTLpktFv");
        setField(term167118, term167118.getClass(), "firstGameId", "FneAhRnndA");
        setField(term167118, term167118.getClass(), "firstRomVersion", "KaPVoelwqi");
        setField(term167118, term167118.getClass(), "firstDataVersion", "URFnfnnVnR");
        setField(term167118, term167118.getClass(), "firstPlayDate", "yYPbcSPbNI");
        setField(term167118, term167118.getClass(), "lastGameId", "xklUMESZww");
        setField(term167118, term167118.getClass(), "lastRomVersion", "ifSelTegbD");
        setField(term167118, term167118.getClass(), "lastDataVersion", "bshnstvPqL");
        setField(term167118, term167118.getClass(), "compatibleCmVersion", "VBdTvbXSPq");
        setField(term167118, term167118.getClass(), "lastPlayDate", "LNxOrvDiLu");
        setIntField(term167118, term167118.getClass(), "lastPlaceId", -1083218160);
        setField(term167118, term167118.getClass(), "lastPlaceName", "jwPgDafpXU");
        setIntField(term167118, term167118.getClass(), "lastRegionId", -524261809);
        setField(term167118, term167118.getClass(), "lastRegionName", "hKlSjWWTMB");
        setIntField(term167118, term167118.getClass(), "lastAllNetId", 947308944);
        setField(term167118, term167118.getClass(), "lastClientId", "RIyRjrXZyz");
        setIntField(term167118, term167118.getClass(), "lastUsedDeckId", 82825939);
        setIntField(term167118, term167118.getClass(), "lastPlayMusicLevel", 695200763);
        setIntField(term167118, term167118.getClass(), "lastEmoneyBrand", -2118312702);
        term167381 = new Integer(-15464500);
        term167383 = new Integer(-1951940945);
        term167385 = new Integer(1618129338);
        term167387 = new Integer(-421041491);
        term167389 = new Integer(1531630551);
        term167391 = new Integer(-1293247427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        Object[] args = new Object[8];
        args[0] = term167116;
        args[1] = term167118;
        args[2] = term167381;
        args[3] = term167383;
        args[4] = term167385;
        args[5] = term167387;
        args[6] = term167389;
        args[7] = term167391;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


