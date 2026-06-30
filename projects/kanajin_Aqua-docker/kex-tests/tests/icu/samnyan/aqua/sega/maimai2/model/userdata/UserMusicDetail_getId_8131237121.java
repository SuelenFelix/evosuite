package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserMusicDetail_getId_8131237121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55520;

    public UserMusicDetail_getId_8131237121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55526 = new Long(2848819812340321742L);
        ArrayList term55587 = new ArrayList();
        Integer term55593 = new Integer(-1693535639);
        Integer term55595 = new Integer(1344744036);
        Integer term55597 = new Integer(-98060427);
        Integer term55599 = new Integer(-1272268399);
        Integer term55601 = new Integer(1120271104);
        Integer term55603 = new Integer(-128435804);
        Integer term55605 = new Integer(2136158480);
        Integer term55607 = new Integer(2118747457);
        Integer term55609 = new Integer(1868344256);
        ArrayList term55591 = new ArrayList();
        ((ArrayList) term55591).add(term55593);
        ((ArrayList) term55591).add(term55595);
        ((ArrayList) term55591).add(term55597);
        ((ArrayList) term55591).add(term55599);
        ((ArrayList) term55591).add(term55601);
        ((ArrayList) term55591).add(term55603);
        ((ArrayList) term55591).add(term55605);
        ((ArrayList) term55591).add(term55607);
        ((ArrayList) term55591).add(term55609);
        term55520 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term55522 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term55524 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term55540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55545 = newInstance(Class.forName("java.time.LocalTime"));
        Object term55550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term55551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term55555 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term55520, term55520.getClass(), "id", 4560845347692916950L);
        setLongField(term55522, term55522.getClass(), "id", 310539009137263944L);
        setLongField(term55524, term55524.getClass(), "id", 2625120506837282980L);
        setField(term55524, term55524.getClass(), "extId", term55526);
        setField(term55524, term55524.getClass(), "luid", "AOsIglRFcp");
        setIntField(term55541, term55541.getClass(), "year", 2022);
        setShortField(term55541, term55541.getClass(), "month", (short) 12);
        setShortField(term55541, term55541.getClass(), "day", (short) 19);
        setField(term55540, term55540.getClass(), "date", term55541);
        setByteField(term55545, term55545.getClass(), "hour", (byte) 11);
        setByteField(term55545, term55545.getClass(), "minute", (byte) 25);
        setByteField(term55545, term55545.getClass(), "second", (byte) 6);
        setIntField(term55545, term55545.getClass(), "nano", 620469872);
        setField(term55540, term55540.getClass(), "time", term55545);
        setField(term55524, term55524.getClass(), "registerTime", term55540);
        setIntField(term55551, term55551.getClass(), "year", 2013);
        setShortField(term55551, term55551.getClass(), "month", (short) 5);
        setShortField(term55551, term55551.getClass(), "day", (short) 3);
        setField(term55550, term55550.getClass(), "date", term55551);
        setByteField(term55555, term55555.getClass(), "hour", (byte) 18);
        setByteField(term55555, term55555.getClass(), "minute", (byte) 52);
        setByteField(term55555, term55555.getClass(), "second", (byte) 15);
        setIntField(term55555, term55555.getClass(), "nano", 241685081);
        setField(term55550, term55550.getClass(), "time", term55555);
        setField(term55524, term55524.getClass(), "accessTime", term55550);
        setField(term55522, term55522.getClass(), "card", term55524);
        setField(term55522, term55522.getClass(), "userName", "bdONLhBZoA");
        setIntField(term55522, term55522.getClass(), "isNetMember", -2056399026);
        setIntField(term55522, term55522.getClass(), "iconId", -150070327);
        setIntField(term55522, term55522.getClass(), "plateId", -731659931);
        setIntField(term55522, term55522.getClass(), "titleId", 645238162);
        setIntField(term55522, term55522.getClass(), "partnerId", -987757870);
        setIntField(term55522, term55522.getClass(), "frameId", 2132585005);
        setIntField(term55522, term55522.getClass(), "selectMapId", 451557051);
        setIntField(term55522, term55522.getClass(), "totalAwake", 71783796);
        setIntField(term55522, term55522.getClass(), "gradeRating", 2085417929);
        setIntField(term55522, term55522.getClass(), "musicRating", 644887242);
        setIntField(term55522, term55522.getClass(), "playerRating", 1544325432);
        setIntField(term55522, term55522.getClass(), "highestRating", 908157389);
        setIntField(term55522, term55522.getClass(), "gradeRank", 691619263);
        setIntField(term55522, term55522.getClass(), "classRank", 637841150);
        setIntField(term55522, term55522.getClass(), "courseRank", 1599041316);
        setField(term55522, term55522.getClass(), "charaSlot", term55587);
        setField(term55522, term55522.getClass(), "charaLockSlot", term55591);
        setLongField(term55522, term55522.getClass(), "contentBit", -3791275881622301002L);
        setIntField(term55522, term55522.getClass(), "playCount", 1478113587);
        setField(term55522, term55522.getClass(), "eventWatchedDate", "qPVeRcolUe");
        setField(term55522, term55522.getClass(), "lastGameId", "AscZyfQFkU");
        setField(term55522, term55522.getClass(), "lastRomVersion", "nPfruizWey");
        setField(term55522, term55522.getClass(), "lastDataVersion", "RvgkUqMUFX");
        setField(term55522, term55522.getClass(), "lastLoginDate", "nOqmldTbXj");
        setField(term55522, term55522.getClass(), "lastPlayDate", "xNDnWDGUNx");
        setIntField(term55522, term55522.getClass(), "lastPlayCredit", 1580986308);
        setIntField(term55522, term55522.getClass(), "lastPlayMode", -870011438);
        setIntField(term55522, term55522.getClass(), "lastPlaceId", -1767217325);
        setField(term55522, term55522.getClass(), "lastPlaceName", "faGVqjLquQ");
        setIntField(term55522, term55522.getClass(), "lastAllNetId", -170630873);
        setIntField(term55522, term55522.getClass(), "lastRegionId", -1246900588);
        setField(term55522, term55522.getClass(), "lastRegionName", "MbsTNUmNqV");
        setField(term55522, term55522.getClass(), "lastClientId", "VdDIonpedU");
        setField(term55522, term55522.getClass(), "lastCountryCode", "VjtXZcUFNx");
        setIntField(term55522, term55522.getClass(), "lastSelectEMoney", 548633933);
        setIntField(term55522, term55522.getClass(), "lastSelectTicket", -1532179986);
        setIntField(term55522, term55522.getClass(), "lastSelectCourse", 1644599689);
        setIntField(term55522, term55522.getClass(), "lastCountCourse", 1665477880);
        setField(term55522, term55522.getClass(), "firstGameId", "bOZSTccXbt");
        setField(term55522, term55522.getClass(), "firstRomVersion", "MBSsxxeNUU");
        setField(term55522, term55522.getClass(), "firstDataVersion", "NmUhmPLSgG");
        setField(term55522, term55522.getClass(), "firstPlayDate", "WJosrfBMfA");
        setField(term55522, term55522.getClass(), "compatibleCmVersion", "ttlGywalKc");
        setField(term55522, term55522.getClass(), "dailyBonusDate", "rQFBspqBzf");
        setField(term55522, term55522.getClass(), "dailyCourseBonusDate", "FmWhAOGAMI");
        setField(term55522, term55522.getClass(), "lastPairLoginDate", "GdjCkRsIrS");
        setField(term55522, term55522.getClass(), "lastTrialPlayDate", "MJNyYzLhkh");
        setIntField(term55522, term55522.getClass(), "playVsCount", 2044728583);
        setIntField(term55522, term55522.getClass(), "playSyncCount", 64790905);
        setIntField(term55522, term55522.getClass(), "winCount", -1199056049);
        setIntField(term55522, term55522.getClass(), "helpCount", -1074336148);
        setIntField(term55522, term55522.getClass(), "comboCount", -561801733);
        setLongField(term55522, term55522.getClass(), "totalDeluxscore", -3269743329730619135L);
        setLongField(term55522, term55522.getClass(), "totalBasicDeluxscore", 7289941847234084104L);
        setLongField(term55522, term55522.getClass(), "totalAdvancedDeluxscore", 852818663192057236L);
        setLongField(term55522, term55522.getClass(), "totalExpertDeluxscore", -4175022778768613863L);
        setLongField(term55522, term55522.getClass(), "totalMasterDeluxscore", -4902671035184844892L);
        setLongField(term55522, term55522.getClass(), "totalReMasterDeluxscore", -9006928175378855684L);
        setIntField(term55522, term55522.getClass(), "totalSync", 2134609936);
        setIntField(term55522, term55522.getClass(), "totalBasicSync", -409989519);
        setIntField(term55522, term55522.getClass(), "totalAdvancedSync", -1293074430);
        setIntField(term55522, term55522.getClass(), "totalExpertSync", 608662433);
        setIntField(term55522, term55522.getClass(), "totalMasterSync", -2015476493);
        setIntField(term55522, term55522.getClass(), "totalReMasterSync", 41528103);
        setLongField(term55522, term55522.getClass(), "totalAchievement", 4672743577102213082L);
        setLongField(term55522, term55522.getClass(), "totalBasicAchievement", -359180515829782685L);
        setLongField(term55522, term55522.getClass(), "totalAdvancedAchievement", 9051152709789005898L);
        setLongField(term55522, term55522.getClass(), "totalExpertAchievement", 7523325429211619652L);
        setLongField(term55522, term55522.getClass(), "totalMasterAchievement", 2129332791275186868L);
        setLongField(term55522, term55522.getClass(), "totalReMasterAchievement", 5292512705125717689L);
        setLongField(term55522, term55522.getClass(), "playerOldRating", -4100892279770468602L);
        setLongField(term55522, term55522.getClass(), "playerNewRating", -459560970226052057L);
        setIntField(term55522, term55522.getClass(), "banState", -1732381818);
        setLongField(term55522, term55522.getClass(), "dateTime", 7829682507826908709L);
        setField(term55520, term55520.getClass(), "user", term55522);
        setIntField(term55520, term55520.getClass(), "musicId", 1960614460);
        setIntField(term55520, term55520.getClass(), "level", -1488501179);
        setIntField(term55520, term55520.getClass(), "playCount", 2086648406);
        setIntField(term55520, term55520.getClass(), "achievement", 805890273);
        setIntField(term55520, term55520.getClass(), "comboStatus", 1078863472);
        setIntField(term55520, term55520.getClass(), "syncStatus", -1845619952);
        setIntField(term55520, term55520.getClass(), "deluxscoreMax", -1363744441);
        setIntField(term55520, term55520.getClass(), "scoreRank", -1303828030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term55520, args);
    }

};


