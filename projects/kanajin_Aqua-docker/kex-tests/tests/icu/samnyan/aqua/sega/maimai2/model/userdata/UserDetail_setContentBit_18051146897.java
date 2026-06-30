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

public class UserDetail_setContentBit_18051146897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4284636;
     Object term4284981;

    public UserDetail_setContentBit_18051146897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4284640 = new Long(18115689564627037L);
        Integer term4284703 = new Integer(1377854679);
        ArrayList term4284701 = new ArrayList();
        ((ArrayList) term4284701).add(term4284703);
        Integer term4284709 = new Integer(-563428268);
        Integer term4284711 = new Integer(60476165);
        ArrayList term4284707 = new ArrayList();
        ((ArrayList) term4284707).add(term4284709);
        ((ArrayList) term4284707).add(term4284711);
        term4284636 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4284638 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4284654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4284655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4284659 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4284664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4284665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4284669 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4284636, term4284636.getClass(), "id", -2753502028005808254L);
        setLongField(term4284638, term4284638.getClass(), "id", -8411852279081236497L);
        setField(term4284638, term4284638.getClass(), "extId", term4284640);
        setField(term4284638, term4284638.getClass(), "luid", "flOahXUBLC");
        setIntField(term4284655, term4284655.getClass(), "year", 2018);
        setShortField(term4284655, term4284655.getClass(), "month", (short) 12);
        setShortField(term4284655, term4284655.getClass(), "day", (short) 10);
        setField(term4284654, term4284654.getClass(), "date", term4284655);
        setByteField(term4284659, term4284659.getClass(), "hour", (byte) 11);
        setByteField(term4284659, term4284659.getClass(), "minute", (byte) 10);
        setByteField(term4284659, term4284659.getClass(), "second", (byte) 57);
        setIntField(term4284659, term4284659.getClass(), "nano", 913759535);
        setField(term4284654, term4284654.getClass(), "time", term4284659);
        setField(term4284638, term4284638.getClass(), "registerTime", term4284654);
        setIntField(term4284665, term4284665.getClass(), "year", 2010);
        setShortField(term4284665, term4284665.getClass(), "month", (short) 11);
        setShortField(term4284665, term4284665.getClass(), "day", (short) 26);
        setField(term4284664, term4284664.getClass(), "date", term4284665);
        setByteField(term4284669, term4284669.getClass(), "hour", (byte) 0);
        setByteField(term4284669, term4284669.getClass(), "minute", (byte) 41);
        setByteField(term4284669, term4284669.getClass(), "second", (byte) 55);
        setIntField(term4284669, term4284669.getClass(), "nano", 636308502);
        setField(term4284664, term4284664.getClass(), "time", term4284669);
        setField(term4284638, term4284638.getClass(), "accessTime", term4284664);
        setField(term4284636, term4284636.getClass(), "card", term4284638);
        setField(term4284636, term4284636.getClass(), "userName", "ExoAFuUfVY");
        setIntField(term4284636, term4284636.getClass(), "isNetMember", -1910542070);
        setIntField(term4284636, term4284636.getClass(), "iconId", 1005524350);
        setIntField(term4284636, term4284636.getClass(), "plateId", 2093436949);
        setIntField(term4284636, term4284636.getClass(), "titleId", 1515843777);
        setIntField(term4284636, term4284636.getClass(), "partnerId", -1222607744);
        setIntField(term4284636, term4284636.getClass(), "frameId", 1608635010);
        setIntField(term4284636, term4284636.getClass(), "selectMapId", -1237766078);
        setIntField(term4284636, term4284636.getClass(), "totalAwake", -1570382962);
        setIntField(term4284636, term4284636.getClass(), "gradeRating", -640598152);
        setIntField(term4284636, term4284636.getClass(), "musicRating", 53488050);
        setIntField(term4284636, term4284636.getClass(), "playerRating", -461127755);
        setIntField(term4284636, term4284636.getClass(), "highestRating", -1002555397);
        setIntField(term4284636, term4284636.getClass(), "gradeRank", -1889420926);
        setIntField(term4284636, term4284636.getClass(), "classRank", -889283642);
        setIntField(term4284636, term4284636.getClass(), "courseRank", 1806692854);
        setField(term4284636, term4284636.getClass(), "charaSlot", term4284701);
        setField(term4284636, term4284636.getClass(), "charaLockSlot", term4284707);
        setLongField(term4284636, term4284636.getClass(), "contentBit", -18414912671959860L);
        setIntField(term4284636, term4284636.getClass(), "playCount", -1800242557);
        setField(term4284636, term4284636.getClass(), "eventWatchedDate", "pzufxjCzbD");
        setField(term4284636, term4284636.getClass(), "lastGameId", "oxwkcOVSxa");
        setField(term4284636, term4284636.getClass(), "lastRomVersion", "fOxlWbNuXv");
        setField(term4284636, term4284636.getClass(), "lastDataVersion", "YlZEbzKCnR");
        setField(term4284636, term4284636.getClass(), "lastLoginDate", "UpuSyjfVZG");
        setField(term4284636, term4284636.getClass(), "lastPlayDate", "KruohmGhPk");
        setIntField(term4284636, term4284636.getClass(), "lastPlayCredit", -849702771);
        setIntField(term4284636, term4284636.getClass(), "lastPlayMode", -1374933737);
        setIntField(term4284636, term4284636.getClass(), "lastPlaceId", -1359305295);
        setField(term4284636, term4284636.getClass(), "lastPlaceName", "dCyUyxOKwM");
        setIntField(term4284636, term4284636.getClass(), "lastAllNetId", 663642433);
        setIntField(term4284636, term4284636.getClass(), "lastRegionId", -1193840503);
        setField(term4284636, term4284636.getClass(), "lastRegionName", "MKvDUJCexJ");
        setField(term4284636, term4284636.getClass(), "lastClientId", "qgEUTrtEec");
        setField(term4284636, term4284636.getClass(), "lastCountryCode", "SDjAkgWMHS");
        setIntField(term4284636, term4284636.getClass(), "lastSelectEMoney", -1180010894);
        setIntField(term4284636, term4284636.getClass(), "lastSelectTicket", 688015108);
        setIntField(term4284636, term4284636.getClass(), "lastSelectCourse", -1451154709);
        setIntField(term4284636, term4284636.getClass(), "lastCountCourse", 51724621);
        setField(term4284636, term4284636.getClass(), "firstGameId", "yuyOFQZcfq");
        setField(term4284636, term4284636.getClass(), "firstRomVersion", "JQiKCNPcXf");
        setField(term4284636, term4284636.getClass(), "firstDataVersion", "nVCvVUaPIO");
        setField(term4284636, term4284636.getClass(), "firstPlayDate", "PpBbJIfCKi");
        setField(term4284636, term4284636.getClass(), "compatibleCmVersion", "rzWbaFpfCL");
        setField(term4284636, term4284636.getClass(), "dailyBonusDate", "AmycgwnqYT");
        setField(term4284636, term4284636.getClass(), "dailyCourseBonusDate", "EodOUgBGEY");
        setField(term4284636, term4284636.getClass(), "lastPairLoginDate", "qAnoRxnigV");
        setField(term4284636, term4284636.getClass(), "lastTrialPlayDate", "bLwjaxvXIf");
        setIntField(term4284636, term4284636.getClass(), "playVsCount", -1528467666);
        setIntField(term4284636, term4284636.getClass(), "playSyncCount", 1974850042);
        setIntField(term4284636, term4284636.getClass(), "winCount", 550770942);
        setIntField(term4284636, term4284636.getClass(), "helpCount", 336811705);
        setIntField(term4284636, term4284636.getClass(), "comboCount", 1637172352);
        setLongField(term4284636, term4284636.getClass(), "totalDeluxscore", 7862140235696837293L);
        setLongField(term4284636, term4284636.getClass(), "totalBasicDeluxscore", -7464783157929812325L);
        setLongField(term4284636, term4284636.getClass(), "totalAdvancedDeluxscore", 8367890801026590712L);
        setLongField(term4284636, term4284636.getClass(), "totalExpertDeluxscore", -8067376446390766825L);
        setLongField(term4284636, term4284636.getClass(), "totalMasterDeluxscore", 7754677669657266624L);
        setLongField(term4284636, term4284636.getClass(), "totalReMasterDeluxscore", 1428131370492978931L);
        setIntField(term4284636, term4284636.getClass(), "totalSync", 2010315089);
        setIntField(term4284636, term4284636.getClass(), "totalBasicSync", 1873107258);
        setIntField(term4284636, term4284636.getClass(), "totalAdvancedSync", -1303052513);
        setIntField(term4284636, term4284636.getClass(), "totalExpertSync", 1810223629);
        setIntField(term4284636, term4284636.getClass(), "totalMasterSync", 1817802115);
        setIntField(term4284636, term4284636.getClass(), "totalReMasterSync", -2068975023);
        setLongField(term4284636, term4284636.getClass(), "totalAchievement", 290814767693442465L);
        setLongField(term4284636, term4284636.getClass(), "totalBasicAchievement", 2473424889836439099L);
        setLongField(term4284636, term4284636.getClass(), "totalAdvancedAchievement", 740181671561045316L);
        setLongField(term4284636, term4284636.getClass(), "totalExpertAchievement", -3090397794901217969L);
        setLongField(term4284636, term4284636.getClass(), "totalMasterAchievement", -1515841666610108155L);
        setLongField(term4284636, term4284636.getClass(), "totalReMasterAchievement", 8348055794100047406L);
        setLongField(term4284636, term4284636.getClass(), "playerOldRating", 3524512032574859478L);
        setLongField(term4284636, term4284636.getClass(), "playerNewRating", 5233097534725817847L);
        setIntField(term4284636, term4284636.getClass(), "banState", -272428066);
        setLongField(term4284636, term4284636.getClass(), "dateTime", -2789921848807028894L);
        term4284981 = new Long(2303139434943137453L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4284981;
        callMethod(klass, "setContentBit", argTypes, term4284636, args);
    }

};


