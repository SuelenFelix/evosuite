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

public class UserTrainingRoom_setId_9487634467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16184;
     Object term16475;

    public UserTrainingRoom_setId_9487634467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16190 = new Long(1439298019805881866L);
        term16184 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom"));
        Object term16186 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term16188 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term16204 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16205 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16209 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16219 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term16184, term16184.getClass(), "id", -5717327658642389548L);
        setLongField(term16186, term16186.getClass(), "id", 8495724482241106293L);
        setLongField(term16188, term16188.getClass(), "id", -4318584834500248968L);
        setField(term16188, term16188.getClass(), "extId", term16190);
        setField(term16188, term16188.getClass(), "luid", "JdOMfNWgLP");
        setIntField(term16205, term16205.getClass(), "year", 2010);
        setShortField(term16205, term16205.getClass(), "month", (short) 2);
        setShortField(term16205, term16205.getClass(), "day", (short) 24);
        setField(term16204, term16204.getClass(), "date", term16205);
        setByteField(term16209, term16209.getClass(), "hour", (byte) 17);
        setByteField(term16209, term16209.getClass(), "minute", (byte) 58);
        setByteField(term16209, term16209.getClass(), "second", (byte) 56);
        setIntField(term16209, term16209.getClass(), "nano", 291725532);
        setField(term16204, term16204.getClass(), "time", term16209);
        setField(term16188, term16188.getClass(), "registerTime", term16204);
        setIntField(term16215, term16215.getClass(), "year", 2028);
        setShortField(term16215, term16215.getClass(), "month", (short) 7);
        setShortField(term16215, term16215.getClass(), "day", (short) 22);
        setField(term16214, term16214.getClass(), "date", term16215);
        setByteField(term16219, term16219.getClass(), "hour", (byte) 18);
        setByteField(term16219, term16219.getClass(), "minute", (byte) 33);
        setByteField(term16219, term16219.getClass(), "second", (byte) 7);
        setIntField(term16219, term16219.getClass(), "nano", 763613074);
        setField(term16214, term16214.getClass(), "time", term16219);
        setField(term16188, term16188.getClass(), "accessTime", term16214);
        setField(term16186, term16186.getClass(), "card", term16188);
        setField(term16186, term16186.getClass(), "userName", "uWqXrwAsDU");
        setIntField(term16186, term16186.getClass(), "level", -861014847);
        setIntField(term16186, term16186.getClass(), "reincarnationNum", 2132934139);
        setLongField(term16186, term16186.getClass(), "exp", -7839957570751440706L);
        setLongField(term16186, term16186.getClass(), "point", -4944032768681866361L);
        setLongField(term16186, term16186.getClass(), "totalPoint", -6657309314982735134L);
        setIntField(term16186, term16186.getClass(), "playCount", -1261824381);
        setIntField(term16186, term16186.getClass(), "jewelCount", 1594426218);
        setIntField(term16186, term16186.getClass(), "totalJewelCount", -2060535464);
        setIntField(term16186, term16186.getClass(), "medalCount", -1242946317);
        setIntField(term16186, term16186.getClass(), "playerRating", -1541566235);
        setIntField(term16186, term16186.getClass(), "highestRating", -189738995);
        setIntField(term16186, term16186.getClass(), "battlePoint", 1943019963);
        setIntField(term16186, term16186.getClass(), "bestBattlePoint", 186472650);
        setIntField(term16186, term16186.getClass(), "overDamageBattlePoint", 279675992);
        setBooleanField(term16186, term16186.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term16186, term16186.getClass(), "nameplateId", -1626074989);
        setIntField(term16186, term16186.getClass(), "trophyId", -552272253);
        setIntField(term16186, term16186.getClass(), "cardId", -633523956);
        setIntField(term16186, term16186.getClass(), "characterId", 1761540885);
        setIntField(term16186, term16186.getClass(), "characterVoiceNo", -168498989);
        setIntField(term16186, term16186.getClass(), "tabSetting", 388247095);
        setIntField(term16186, term16186.getClass(), "tabSortSetting", -1320402633);
        setIntField(term16186, term16186.getClass(), "cardCategorySetting", 919602316);
        setIntField(term16186, term16186.getClass(), "cardSortSetting", 1833713431);
        setIntField(term16186, term16186.getClass(), "rivalScoreCategorySetting", -706222608);
        setIntField(term16186, term16186.getClass(), "playedTutorialBit", -2003607923);
        setIntField(term16186, term16186.getClass(), "firstTutorialCancelNum", 1378805929);
        setLongField(term16186, term16186.getClass(), "sumTechHighScore", -685001356309682920L);
        setLongField(term16186, term16186.getClass(), "sumTechBasicHighScore", -3189918180129674609L);
        setLongField(term16186, term16186.getClass(), "sumTechAdvancedHighScore", 5271284328066798769L);
        setLongField(term16186, term16186.getClass(), "sumTechExpertHighScore", 1924411240174876881L);
        setLongField(term16186, term16186.getClass(), "sumTechMasterHighScore", -8287954071414913487L);
        setLongField(term16186, term16186.getClass(), "sumTechLunaticHighScore", -1379663556617181551L);
        setLongField(term16186, term16186.getClass(), "sumBattleHighScore", -927624000067769617L);
        setLongField(term16186, term16186.getClass(), "sumBattleBasicHighScore", 2978561187278004830L);
        setLongField(term16186, term16186.getClass(), "sumBattleAdvancedHighScore", 4903104596895674146L);
        setLongField(term16186, term16186.getClass(), "sumBattleExpertHighScore", 3410093279424884335L);
        setLongField(term16186, term16186.getClass(), "sumBattleMasterHighScore", -8848853088235282046L);
        setLongField(term16186, term16186.getClass(), "sumBattleLunaticHighScore", 5646422912118770408L);
        setField(term16186, term16186.getClass(), "eventWatchedDate", "hgFbWAUtsu");
        setField(term16186, term16186.getClass(), "cmEventWatchedDate", "HqoTWlkbwF");
        setField(term16186, term16186.getClass(), "firstGameId", "CwNELDTAPP");
        setField(term16186, term16186.getClass(), "firstRomVersion", "GSzQdbHLHw");
        setField(term16186, term16186.getClass(), "firstDataVersion", "IkfarsYNJO");
        setField(term16186, term16186.getClass(), "firstPlayDate", "aZKOWhHMEh");
        setField(term16186, term16186.getClass(), "lastGameId", "YfkhviKZwl");
        setField(term16186, term16186.getClass(), "lastRomVersion", "DcOhhAfJTI");
        setField(term16186, term16186.getClass(), "lastDataVersion", "gYTIkBFOoS");
        setField(term16186, term16186.getClass(), "compatibleCmVersion", "xmzSoVgiED");
        setField(term16186, term16186.getClass(), "lastPlayDate", "pdSvedKgPq");
        setIntField(term16186, term16186.getClass(), "lastPlaceId", 695052304);
        setField(term16186, term16186.getClass(), "lastPlaceName", "epPTwvcoyb");
        setIntField(term16186, term16186.getClass(), "lastRegionId", -179937218);
        setField(term16186, term16186.getClass(), "lastRegionName", "UBPHmOICBs");
        setIntField(term16186, term16186.getClass(), "lastAllNetId", 940896043);
        setField(term16186, term16186.getClass(), "lastClientId", "IDJUVPgUJf");
        setIntField(term16186, term16186.getClass(), "lastUsedDeckId", -1156002984);
        setIntField(term16186, term16186.getClass(), "lastPlayMusicLevel", 1676254730);
        setIntField(term16186, term16186.getClass(), "lastEmoneyBrand", -1661200819);
        setField(term16184, term16184.getClass(), "user", term16186);
        setField(term16184, term16184.getClass(), "authKey", "JmnWRJUxGr");
        setIntField(term16184, term16184.getClass(), "roomId", -235039141);
        setIntField(term16184, term16184.getClass(), "cardId", -1414233013);
        setField(term16184, term16184.getClass(), "valueDate", "wgRGBNrTGP");
        term16475 = new Long(1370021222113276207L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTrainingRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term16475;
        callMethod(klass, "setId", argTypes, term16184, args);
    }

};


