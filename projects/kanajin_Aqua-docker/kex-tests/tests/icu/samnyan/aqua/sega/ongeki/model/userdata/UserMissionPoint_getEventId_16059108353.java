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

public class UserMissionPoint_getEventId_16059108353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7745;

    public UserMissionPoint_getEventId_16059108353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7751 = new Long(-6573104506744284592L);
        term7745 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint"));
        Object term7747 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term7749 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term7765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7770 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7775 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7776 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7780 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term7745, term7745.getClass(), "id", 4139034517298316285L);
        setLongField(term7747, term7747.getClass(), "id", 5797412846146719084L);
        setLongField(term7749, term7749.getClass(), "id", 5319740127125920367L);
        setField(term7749, term7749.getClass(), "extId", term7751);
        setField(term7749, term7749.getClass(), "luid", "zNdorvdUgu");
        setIntField(term7766, term7766.getClass(), "year", 2010);
        setShortField(term7766, term7766.getClass(), "month", (short) 1);
        setShortField(term7766, term7766.getClass(), "day", (short) 17);
        setField(term7765, term7765.getClass(), "date", term7766);
        setByteField(term7770, term7770.getClass(), "hour", (byte) 13);
        setByteField(term7770, term7770.getClass(), "minute", (byte) 5);
        setByteField(term7770, term7770.getClass(), "second", (byte) 51);
        setIntField(term7770, term7770.getClass(), "nano", 362260580);
        setField(term7765, term7765.getClass(), "time", term7770);
        setField(term7749, term7749.getClass(), "registerTime", term7765);
        setIntField(term7776, term7776.getClass(), "year", 2010);
        setShortField(term7776, term7776.getClass(), "month", (short) 9);
        setShortField(term7776, term7776.getClass(), "day", (short) 28);
        setField(term7775, term7775.getClass(), "date", term7776);
        setByteField(term7780, term7780.getClass(), "hour", (byte) 6);
        setByteField(term7780, term7780.getClass(), "minute", (byte) 4);
        setByteField(term7780, term7780.getClass(), "second", (byte) 54);
        setIntField(term7780, term7780.getClass(), "nano", 604713782);
        setField(term7775, term7775.getClass(), "time", term7780);
        setField(term7749, term7749.getClass(), "accessTime", term7775);
        setField(term7747, term7747.getClass(), "card", term7749);
        setField(term7747, term7747.getClass(), "userName", "oPxuZbkYio");
        setIntField(term7747, term7747.getClass(), "level", 40571662);
        setIntField(term7747, term7747.getClass(), "reincarnationNum", 1863910269);
        setLongField(term7747, term7747.getClass(), "exp", 6465987664600701876L);
        setLongField(term7747, term7747.getClass(), "point", -136372844051852955L);
        setLongField(term7747, term7747.getClass(), "totalPoint", -7632759764262745126L);
        setIntField(term7747, term7747.getClass(), "playCount", 864645689);
        setIntField(term7747, term7747.getClass(), "jewelCount", 279384872);
        setIntField(term7747, term7747.getClass(), "totalJewelCount", 1427305953);
        setIntField(term7747, term7747.getClass(), "medalCount", -781832877);
        setIntField(term7747, term7747.getClass(), "playerRating", 797203987);
        setIntField(term7747, term7747.getClass(), "highestRating", 1973060703);
        setIntField(term7747, term7747.getClass(), "battlePoint", -138239905);
        setIntField(term7747, term7747.getClass(), "bestBattlePoint", 1709474063);
        setIntField(term7747, term7747.getClass(), "overDamageBattlePoint", 1406617209);
        setBooleanField(term7747, term7747.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term7747, term7747.getClass(), "nameplateId", 1706047059);
        setIntField(term7747, term7747.getClass(), "trophyId", 590451710);
        setIntField(term7747, term7747.getClass(), "cardId", -1999787419);
        setIntField(term7747, term7747.getClass(), "characterId", -1224443634);
        setIntField(term7747, term7747.getClass(), "characterVoiceNo", 1048451946);
        setIntField(term7747, term7747.getClass(), "tabSetting", 5603560);
        setIntField(term7747, term7747.getClass(), "tabSortSetting", -1079020032);
        setIntField(term7747, term7747.getClass(), "cardCategorySetting", -1973791064);
        setIntField(term7747, term7747.getClass(), "cardSortSetting", -2072158633);
        setIntField(term7747, term7747.getClass(), "rivalScoreCategorySetting", -355469363);
        setIntField(term7747, term7747.getClass(), "playedTutorialBit", 1465188553);
        setIntField(term7747, term7747.getClass(), "firstTutorialCancelNum", 1633913667);
        setLongField(term7747, term7747.getClass(), "sumTechHighScore", 3746481521207337771L);
        setLongField(term7747, term7747.getClass(), "sumTechBasicHighScore", 4341016500855678917L);
        setLongField(term7747, term7747.getClass(), "sumTechAdvancedHighScore", -5871746020807491998L);
        setLongField(term7747, term7747.getClass(), "sumTechExpertHighScore", 4742108233936970770L);
        setLongField(term7747, term7747.getClass(), "sumTechMasterHighScore", 2722004046017350471L);
        setLongField(term7747, term7747.getClass(), "sumTechLunaticHighScore", 6636235983121346803L);
        setLongField(term7747, term7747.getClass(), "sumBattleHighScore", 146749226579788091L);
        setLongField(term7747, term7747.getClass(), "sumBattleBasicHighScore", -1279670138064751276L);
        setLongField(term7747, term7747.getClass(), "sumBattleAdvancedHighScore", -7205236974351118210L);
        setLongField(term7747, term7747.getClass(), "sumBattleExpertHighScore", -2136893352275781569L);
        setLongField(term7747, term7747.getClass(), "sumBattleMasterHighScore", -9147545274054597570L);
        setLongField(term7747, term7747.getClass(), "sumBattleLunaticHighScore", -8398381579707958144L);
        setField(term7747, term7747.getClass(), "eventWatchedDate", "vKitydDVnM");
        setField(term7747, term7747.getClass(), "cmEventWatchedDate", "urCiQnUFBM");
        setField(term7747, term7747.getClass(), "firstGameId", "EKjQdtKxAM");
        setField(term7747, term7747.getClass(), "firstRomVersion", "TXZAIPQJHt");
        setField(term7747, term7747.getClass(), "firstDataVersion", "DIbeDHICho");
        setField(term7747, term7747.getClass(), "firstPlayDate", "dJGPlmSRnz");
        setField(term7747, term7747.getClass(), "lastGameId", "DPskuFUobI");
        setField(term7747, term7747.getClass(), "lastRomVersion", "wBGfLpNNiZ");
        setField(term7747, term7747.getClass(), "lastDataVersion", "yUGCjlqgJE");
        setField(term7747, term7747.getClass(), "compatibleCmVersion", "PXdVZyoJyC");
        setField(term7747, term7747.getClass(), "lastPlayDate", "vLerpqavFM");
        setIntField(term7747, term7747.getClass(), "lastPlaceId", 1292332296);
        setField(term7747, term7747.getClass(), "lastPlaceName", "qnvxzwuGKX");
        setIntField(term7747, term7747.getClass(), "lastRegionId", -1415256843);
        setField(term7747, term7747.getClass(), "lastRegionName", "EdPAvpluZg");
        setIntField(term7747, term7747.getClass(), "lastAllNetId", 612177768);
        setField(term7747, term7747.getClass(), "lastClientId", "DzHVBMqWtE");
        setIntField(term7747, term7747.getClass(), "lastUsedDeckId", -1626451656);
        setIntField(term7747, term7747.getClass(), "lastPlayMusicLevel", 173952451);
        setIntField(term7747, term7747.getClass(), "lastEmoneyBrand", -1972033388);
        setField(term7745, term7745.getClass(), "user", term7747);
        setIntField(term7745, term7745.getClass(), "eventId", -1005024758);
        setLongField(term7745, term7745.getClass(), "point", -2195061939206930224L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMissionPoint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventId", argTypes, term7745, args);
    }

};


