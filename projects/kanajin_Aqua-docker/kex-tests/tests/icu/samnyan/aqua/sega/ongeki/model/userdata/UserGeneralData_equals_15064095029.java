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

public class UserGeneralData_equals_15064095029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298434;
     Object term298723;

    public UserGeneralData_equals_15064095029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term298440 = new Long(-5044181804110715069L);
        term298434 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term298436 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term298438 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term298454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298459 = newInstance(Class.forName("java.time.LocalTime"));
        Object term298464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term298465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term298469 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term298434, term298434.getClass(), "id", -677659432754360264L);
        setLongField(term298436, term298436.getClass(), "id", 1527882439029728825L);
        setLongField(term298438, term298438.getClass(), "id", 3358910457066557086L);
        setField(term298438, term298438.getClass(), "extId", term298440);
        setField(term298438, term298438.getClass(), "luid", "gcqWfMAFPK");
        setIntField(term298455, term298455.getClass(), "year", 2026);
        setShortField(term298455, term298455.getClass(), "month", (short) 3);
        setShortField(term298455, term298455.getClass(), "day", (short) 8);
        setField(term298454, term298454.getClass(), "date", term298455);
        setByteField(term298459, term298459.getClass(), "hour", (byte) 1);
        setByteField(term298459, term298459.getClass(), "minute", (byte) 53);
        setByteField(term298459, term298459.getClass(), "second", (byte) 51);
        setIntField(term298459, term298459.getClass(), "nano", 628643371);
        setField(term298454, term298454.getClass(), "time", term298459);
        setField(term298438, term298438.getClass(), "registerTime", term298454);
        setIntField(term298465, term298465.getClass(), "year", 2015);
        setShortField(term298465, term298465.getClass(), "month", (short) 10);
        setShortField(term298465, term298465.getClass(), "day", (short) 24);
        setField(term298464, term298464.getClass(), "date", term298465);
        setByteField(term298469, term298469.getClass(), "hour", (byte) 2);
        setByteField(term298469, term298469.getClass(), "minute", (byte) 33);
        setByteField(term298469, term298469.getClass(), "second", (byte) 35);
        setIntField(term298469, term298469.getClass(), "nano", 733603737);
        setField(term298464, term298464.getClass(), "time", term298469);
        setField(term298438, term298438.getClass(), "accessTime", term298464);
        setField(term298436, term298436.getClass(), "card", term298438);
        setField(term298436, term298436.getClass(), "userName", "ScxLRRGgyT");
        setIntField(term298436, term298436.getClass(), "level", -365532017);
        setIntField(term298436, term298436.getClass(), "reincarnationNum", 940040468);
        setLongField(term298436, term298436.getClass(), "exp", 1406861745181361921L);
        setLongField(term298436, term298436.getClass(), "point", -7185014376295137154L);
        setLongField(term298436, term298436.getClass(), "totalPoint", 5439850716734875105L);
        setIntField(term298436, term298436.getClass(), "playCount", -789000194);
        setIntField(term298436, term298436.getClass(), "jewelCount", -202321765);
        setIntField(term298436, term298436.getClass(), "totalJewelCount", -1799223779);
        setIntField(term298436, term298436.getClass(), "medalCount", 1123218119);
        setIntField(term298436, term298436.getClass(), "playerRating", 1734978887);
        setIntField(term298436, term298436.getClass(), "highestRating", 218398259);
        setIntField(term298436, term298436.getClass(), "battlePoint", -177030988);
        setIntField(term298436, term298436.getClass(), "bestBattlePoint", -1044739601);
        setIntField(term298436, term298436.getClass(), "overDamageBattlePoint", -608436046);
        setBooleanField(term298436, term298436.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term298436, term298436.getClass(), "nameplateId", -1062179049);
        setIntField(term298436, term298436.getClass(), "trophyId", -1983264312);
        setIntField(term298436, term298436.getClass(), "cardId", 575303209);
        setIntField(term298436, term298436.getClass(), "characterId", 1892767769);
        setIntField(term298436, term298436.getClass(), "characterVoiceNo", 661464445);
        setIntField(term298436, term298436.getClass(), "tabSetting", 842426042);
        setIntField(term298436, term298436.getClass(), "tabSortSetting", -542532785);
        setIntField(term298436, term298436.getClass(), "cardCategorySetting", -184121623);
        setIntField(term298436, term298436.getClass(), "cardSortSetting", 1910371641);
        setIntField(term298436, term298436.getClass(), "rivalScoreCategorySetting", 705106230);
        setIntField(term298436, term298436.getClass(), "playedTutorialBit", -1621671923);
        setIntField(term298436, term298436.getClass(), "firstTutorialCancelNum", -671808728);
        setLongField(term298436, term298436.getClass(), "sumTechHighScore", 7412484025374469276L);
        setLongField(term298436, term298436.getClass(), "sumTechBasicHighScore", -5740324664415425487L);
        setLongField(term298436, term298436.getClass(), "sumTechAdvancedHighScore", 1596757993375581168L);
        setLongField(term298436, term298436.getClass(), "sumTechExpertHighScore", -6717208924799722183L);
        setLongField(term298436, term298436.getClass(), "sumTechMasterHighScore", 3896203772842879145L);
        setLongField(term298436, term298436.getClass(), "sumTechLunaticHighScore", -1954887408308298029L);
        setLongField(term298436, term298436.getClass(), "sumBattleHighScore", -1173654755322633867L);
        setLongField(term298436, term298436.getClass(), "sumBattleBasicHighScore", -8491871203127400369L);
        setLongField(term298436, term298436.getClass(), "sumBattleAdvancedHighScore", 5441916684425215231L);
        setLongField(term298436, term298436.getClass(), "sumBattleExpertHighScore", 1823750862610512790L);
        setLongField(term298436, term298436.getClass(), "sumBattleMasterHighScore", -4792349810456319559L);
        setLongField(term298436, term298436.getClass(), "sumBattleLunaticHighScore", 566953504498945169L);
        setField(term298436, term298436.getClass(), "eventWatchedDate", "CkxvejcJwL");
        setField(term298436, term298436.getClass(), "cmEventWatchedDate", "xbTYhfucaY");
        setField(term298436, term298436.getClass(), "firstGameId", "oOhYSsilyF");
        setField(term298436, term298436.getClass(), "firstRomVersion", "ptFtBxcggt");
        setField(term298436, term298436.getClass(), "firstDataVersion", "CNPbNDYCYT");
        setField(term298436, term298436.getClass(), "firstPlayDate", "CmSBEaXuvA");
        setField(term298436, term298436.getClass(), "lastGameId", "MzZzTPvXwn");
        setField(term298436, term298436.getClass(), "lastRomVersion", "XzOajjTxbc");
        setField(term298436, term298436.getClass(), "lastDataVersion", "EJFxVoQvCT");
        setField(term298436, term298436.getClass(), "compatibleCmVersion", "mrXdIpiGAF");
        setField(term298436, term298436.getClass(), "lastPlayDate", "uTxhnRMNZt");
        setIntField(term298436, term298436.getClass(), "lastPlaceId", 493303410);
        setField(term298436, term298436.getClass(), "lastPlaceName", "qaqujvBPtP");
        setIntField(term298436, term298436.getClass(), "lastRegionId", 853208541);
        setField(term298436, term298436.getClass(), "lastRegionName", "ZIFZsMkyty");
        setIntField(term298436, term298436.getClass(), "lastAllNetId", 878743987);
        setField(term298436, term298436.getClass(), "lastClientId", "OQwMSrFmSo");
        setIntField(term298436, term298436.getClass(), "lastUsedDeckId", 914263736);
        setIntField(term298436, term298436.getClass(), "lastPlayMusicLevel", -1847038056);
        setIntField(term298436, term298436.getClass(), "lastEmoneyBrand", 1132910883);
        setField(term298434, term298434.getClass(), "user", term298436);
        setField(term298434, term298434.getClass(), "propertyKey", "iIxzLmizFZ");
        setField(term298434, term298434.getClass(), "propertyValue", "nirCEPCEzD");
        term298723 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term298723;
        callMethod(klass, "equals", argTypes, term298434, args);
    }

};


