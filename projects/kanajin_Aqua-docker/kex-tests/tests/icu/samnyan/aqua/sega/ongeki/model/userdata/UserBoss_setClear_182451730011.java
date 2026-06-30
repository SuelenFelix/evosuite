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
import java.lang.Boolean;

public class UserBoss_setClear_182451730011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138869;
     Object term139138;

    public UserBoss_setClear_182451730011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term138875 = new Long(-7191625829563442696L);
        term138869 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss"));
        Object term138871 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term138873 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term138889 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138890 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138894 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138904 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term138869, term138869.getClass(), "id", 6662905725936428589L);
        setLongField(term138871, term138871.getClass(), "id", 7316889589357314958L);
        setLongField(term138873, term138873.getClass(), "id", 8992372673970097971L);
        setField(term138873, term138873.getClass(), "extId", term138875);
        setField(term138873, term138873.getClass(), "luid", "ChicGOdcQQ");
        setIntField(term138890, term138890.getClass(), "year", 2020);
        setShortField(term138890, term138890.getClass(), "month", (short) 9);
        setShortField(term138890, term138890.getClass(), "day", (short) 29);
        setField(term138889, term138889.getClass(), "date", term138890);
        setByteField(term138894, term138894.getClass(), "hour", (byte) 4);
        setByteField(term138894, term138894.getClass(), "minute", (byte) 6);
        setByteField(term138894, term138894.getClass(), "second", (byte) 57);
        setIntField(term138894, term138894.getClass(), "nano", 936141628);
        setField(term138889, term138889.getClass(), "time", term138894);
        setField(term138873, term138873.getClass(), "registerTime", term138889);
        setIntField(term138900, term138900.getClass(), "year", 2027);
        setShortField(term138900, term138900.getClass(), "month", (short) 7);
        setShortField(term138900, term138900.getClass(), "day", (short) 24);
        setField(term138899, term138899.getClass(), "date", term138900);
        setByteField(term138904, term138904.getClass(), "hour", (byte) 10);
        setByteField(term138904, term138904.getClass(), "minute", (byte) 31);
        setByteField(term138904, term138904.getClass(), "second", (byte) 33);
        setIntField(term138904, term138904.getClass(), "nano", 451257890);
        setField(term138899, term138899.getClass(), "time", term138904);
        setField(term138873, term138873.getClass(), "accessTime", term138899);
        setField(term138871, term138871.getClass(), "card", term138873);
        setField(term138871, term138871.getClass(), "userName", "RDbCrwuOqx");
        setIntField(term138871, term138871.getClass(), "level", -836318034);
        setIntField(term138871, term138871.getClass(), "reincarnationNum", 2012369494);
        setLongField(term138871, term138871.getClass(), "exp", -4753797822246778771L);
        setLongField(term138871, term138871.getClass(), "point", 8528800812697863920L);
        setLongField(term138871, term138871.getClass(), "totalPoint", -3581747990555779571L);
        setIntField(term138871, term138871.getClass(), "playCount", -380390171);
        setIntField(term138871, term138871.getClass(), "jewelCount", -733694118);
        setIntField(term138871, term138871.getClass(), "totalJewelCount", -1720693402);
        setIntField(term138871, term138871.getClass(), "medalCount", 325282129);
        setIntField(term138871, term138871.getClass(), "playerRating", -446219627);
        setIntField(term138871, term138871.getClass(), "highestRating", 1440215146);
        setIntField(term138871, term138871.getClass(), "battlePoint", 593096680);
        setIntField(term138871, term138871.getClass(), "bestBattlePoint", -223776565);
        setIntField(term138871, term138871.getClass(), "overDamageBattlePoint", -1246811706);
        setBooleanField(term138871, term138871.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term138871, term138871.getClass(), "nameplateId", 904470208);
        setIntField(term138871, term138871.getClass(), "trophyId", -2102304044);
        setIntField(term138871, term138871.getClass(), "cardId", 810803651);
        setIntField(term138871, term138871.getClass(), "characterId", 552468029);
        setIntField(term138871, term138871.getClass(), "characterVoiceNo", -556247755);
        setIntField(term138871, term138871.getClass(), "tabSetting", 1888522182);
        setIntField(term138871, term138871.getClass(), "tabSortSetting", -2083490818);
        setIntField(term138871, term138871.getClass(), "cardCategorySetting", 1865419687);
        setIntField(term138871, term138871.getClass(), "cardSortSetting", -1342626701);
        setIntField(term138871, term138871.getClass(), "rivalScoreCategorySetting", -2008937598);
        setIntField(term138871, term138871.getClass(), "playedTutorialBit", 980261932);
        setIntField(term138871, term138871.getClass(), "firstTutorialCancelNum", 778013422);
        setLongField(term138871, term138871.getClass(), "sumTechHighScore", 6212218654776405325L);
        setLongField(term138871, term138871.getClass(), "sumTechBasicHighScore", -8144978660380135106L);
        setLongField(term138871, term138871.getClass(), "sumTechAdvancedHighScore", -374165172490836581L);
        setLongField(term138871, term138871.getClass(), "sumTechExpertHighScore", -6575843541005135290L);
        setLongField(term138871, term138871.getClass(), "sumTechMasterHighScore", 901367433127493296L);
        setLongField(term138871, term138871.getClass(), "sumTechLunaticHighScore", -8355659215245618277L);
        setLongField(term138871, term138871.getClass(), "sumBattleHighScore", 4547001176658065750L);
        setLongField(term138871, term138871.getClass(), "sumBattleBasicHighScore", -3467460516920831762L);
        setLongField(term138871, term138871.getClass(), "sumBattleAdvancedHighScore", -3730319670946426650L);
        setLongField(term138871, term138871.getClass(), "sumBattleExpertHighScore", -1460639527477337493L);
        setLongField(term138871, term138871.getClass(), "sumBattleMasterHighScore", 604945224552655407L);
        setLongField(term138871, term138871.getClass(), "sumBattleLunaticHighScore", 7739535751433486399L);
        setField(term138871, term138871.getClass(), "eventWatchedDate", "GpKiABHvoe");
        setField(term138871, term138871.getClass(), "cmEventWatchedDate", "csdvKvMKzx");
        setField(term138871, term138871.getClass(), "firstGameId", "xfyCONULzw");
        setField(term138871, term138871.getClass(), "firstRomVersion", "SmpXEpmGyR");
        setField(term138871, term138871.getClass(), "firstDataVersion", "foXieiGQTk");
        setField(term138871, term138871.getClass(), "firstPlayDate", "XgtGzhZjwe");
        setField(term138871, term138871.getClass(), "lastGameId", "kuzULljuRL");
        setField(term138871, term138871.getClass(), "lastRomVersion", "DNgbgDcryI");
        setField(term138871, term138871.getClass(), "lastDataVersion", "NHOLoiInVI");
        setField(term138871, term138871.getClass(), "compatibleCmVersion", "PVcjWjrzGf");
        setField(term138871, term138871.getClass(), "lastPlayDate", "EsauoauZcZ");
        setIntField(term138871, term138871.getClass(), "lastPlaceId", -704266313);
        setField(term138871, term138871.getClass(), "lastPlaceName", "qiDNqUNRHY");
        setIntField(term138871, term138871.getClass(), "lastRegionId", -1073752722);
        setField(term138871, term138871.getClass(), "lastRegionName", "WjRIILfuQl");
        setIntField(term138871, term138871.getClass(), "lastAllNetId", 394545224);
        setField(term138871, term138871.getClass(), "lastClientId", "FqgiIhfmCu");
        setIntField(term138871, term138871.getClass(), "lastUsedDeckId", -2021938994);
        setIntField(term138871, term138871.getClass(), "lastPlayMusicLevel", -753325610);
        setIntField(term138871, term138871.getClass(), "lastEmoneyBrand", 177871424);
        setField(term138869, term138869.getClass(), "user", term138871);
        setIntField(term138869, term138869.getClass(), "musicId", -1856602556);
        setIntField(term138869, term138869.getClass(), "damage", -1558615641);
        setBooleanField(term138869, term138869.getClass(), "isClear", false);
        setIntField(term138869, term138869.getClass(), "eventId", -172970364);
        term139138 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term139138;
        callMethod(klass, "setClear", argTypes, term138869, args);
    }

};


