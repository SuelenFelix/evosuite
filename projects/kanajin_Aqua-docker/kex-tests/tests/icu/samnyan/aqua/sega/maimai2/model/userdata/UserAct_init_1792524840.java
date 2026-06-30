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

public class UserAct_init_1792524840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserAct_init_1792524840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5 = new Long(2442117782898005296L);
        Integer term68 = new Integer(568599855);
        Integer term70 = new Integer(1162663216);
        Integer term72 = new Integer(1484323161);
        Integer term74 = new Integer(391863371);
        Integer term76 = new Integer(-1922583790);
        ArrayList term66 = new ArrayList();
        ((ArrayList) term66).add(term68);
        ((ArrayList) term66).add(term70);
        ((ArrayList) term66).add(term72);
        ((ArrayList) term66).add(term74);
        ((ArrayList) term66).add(term76);
        Integer term82 = new Integer(-616727354);
        Integer term84 = new Integer(-1955890973);
        Integer term86 = new Integer(-2038273078);
        Integer term88 = new Integer(1227103734);
        ArrayList term80 = new ArrayList();
        ((ArrayList) term80).add(term82);
        ((ArrayList) term80).add(term84);
        ((ArrayList) term80).add(term86);
        ((ArrayList) term80).add(term88);
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term3 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term19 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setLongField(term3, term3.getClass(), "id", 6375119433582206027L);
        setField(term3, term3.getClass(), "extId", term5);
        setField(term3, term3.getClass(), "luid", "PAEBtnZtTD");
        setIntField(term20, term20.getClass(), "year", 2012);
        setShortField(term20, term20.getClass(), "month", (short) 8);
        setShortField(term20, term20.getClass(), "day", (short) 25);
        setField(term19, term19.getClass(), "date", term20);
        setByteField(term24, term24.getClass(), "hour", (byte) 5);
        setByteField(term24, term24.getClass(), "minute", (byte) 20);
        setByteField(term24, term24.getClass(), "second", (byte) 50);
        setIntField(term24, term24.getClass(), "nano", 345595912);
        setField(term19, term19.getClass(), "time", term24);
        setField(term3, term3.getClass(), "registerTime", term19);
        setIntField(term30, term30.getClass(), "year", 2021);
        setShortField(term30, term30.getClass(), "month", (short) 1);
        setShortField(term30, term30.getClass(), "day", (short) 18);
        setField(term29, term29.getClass(), "date", term30);
        setByteField(term34, term34.getClass(), "hour", (byte) 13);
        setByteField(term34, term34.getClass(), "minute", (byte) 38);
        setByteField(term34, term34.getClass(), "second", (byte) 26);
        setIntField(term34, term34.getClass(), "nano", 544608644);
        setField(term29, term29.getClass(), "time", term34);
        setField(term3, term3.getClass(), "accessTime", term29);
        setField(term1, term1.getClass(), "card", term3);
        setField(term1, term1.getClass(), "userName", "sjlJAEtRrb");
        setIntField(term1, term1.getClass(), "isNetMember", 568599855);
        setIntField(term1, term1.getClass(), "iconId", 1162663216);
        setIntField(term1, term1.getClass(), "plateId", 1484323161);
        setIntField(term1, term1.getClass(), "titleId", 391863371);
        setIntField(term1, term1.getClass(), "partnerId", -1922583790);
        setIntField(term1, term1.getClass(), "frameId", -616727354);
        setIntField(term1, term1.getClass(), "selectMapId", -1955890973);
        setIntField(term1, term1.getClass(), "totalAwake", -2038273078);
        setIntField(term1, term1.getClass(), "gradeRating", 1227103734);
        setIntField(term1, term1.getClass(), "musicRating", -1339778481);
        setIntField(term1, term1.getClass(), "playerRating", 1725571209);
        setIntField(term1, term1.getClass(), "highestRating", -522618178);
        setIntField(term1, term1.getClass(), "gradeRank", 1134449235);
        setIntField(term1, term1.getClass(), "classRank", -883034806);
        setIntField(term1, term1.getClass(), "courseRank", 1585847225);
        setField(term1, term1.getClass(), "charaSlot", term66);
        setField(term1, term1.getClass(), "charaLockSlot", term80);
        setLongField(term1, term1.getClass(), "contentBit", -8257434502486459194L);
        setIntField(term1, term1.getClass(), "playCount", 597278769);
        setField(term1, term1.getClass(), "eventWatchedDate", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "lastGameId", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "lastRomVersion", "jJCZpVmanW");
        setField(term1, term1.getClass(), "lastDataVersion", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "lastLoginDate", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "lastPlayDate", "MjGYSRKTNF");
        setIntField(term1, term1.getClass(), "lastPlayCredit", -1685132342);
        setIntField(term1, term1.getClass(), "lastPlayMode", -1456670397);
        setIntField(term1, term1.getClass(), "lastPlaceId", 1622346318);
        setField(term1, term1.getClass(), "lastPlaceName", "hRNSzYYIrc");
        setIntField(term1, term1.getClass(), "lastAllNetId", 1048535127);
        setIntField(term1, term1.getClass(), "lastRegionId", -655067527);
        setField(term1, term1.getClass(), "lastRegionName", "RMFIsYGgne");
        setField(term1, term1.getClass(), "lastClientId", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "lastCountryCode", "uuaPigETmJ");
        setIntField(term1, term1.getClass(), "lastSelectEMoney", -6029667);
        setIntField(term1, term1.getClass(), "lastSelectTicket", -2068769794);
        setIntField(term1, term1.getClass(), "lastSelectCourse", -117576464);
        setIntField(term1, term1.getClass(), "lastCountCourse", -1007160944);
        setField(term1, term1.getClass(), "firstGameId", "MxlszYVzRf");
        setField(term1, term1.getClass(), "firstRomVersion", "LQFpaHEwXR");
        setField(term1, term1.getClass(), "firstDataVersion", "oVcInYnLWB");
        setField(term1, term1.getClass(), "firstPlayDate", "aJlieCFVtF");
        setField(term1, term1.getClass(), "compatibleCmVersion", "ZiaGIbnzTs");
        setField(term1, term1.getClass(), "dailyBonusDate", "tbcdzjIfER");
        setField(term1, term1.getClass(), "dailyCourseBonusDate", "HyxfbSQYBe");
        setField(term1, term1.getClass(), "lastPairLoginDate", "pCTimMblYc");
        setField(term1, term1.getClass(), "lastTrialPlayDate", "hNxWaHcfhY");
        setIntField(term1, term1.getClass(), "playVsCount", 1135664017);
        setIntField(term1, term1.getClass(), "playSyncCount", 590364439);
        setIntField(term1, term1.getClass(), "winCount", 865208305);
        setIntField(term1, term1.getClass(), "helpCount", -1275173084);
        setIntField(term1, term1.getClass(), "comboCount", -244121226);
        setLongField(term1, term1.getClass(), "totalDeluxscore", -8400487765614892086L);
        setLongField(term1, term1.getClass(), "totalBasicDeluxscore", 5270370404989704783L);
        setLongField(term1, term1.getClass(), "totalAdvancedDeluxscore", 7411271909051562686L);
        setLongField(term1, term1.getClass(), "totalExpertDeluxscore", 4872422362414183754L);
        setLongField(term1, term1.getClass(), "totalMasterDeluxscore", 6811161968424632369L);
        setLongField(term1, term1.getClass(), "totalReMasterDeluxscore", -7237588299778557629L);
        setIntField(term1, term1.getClass(), "totalSync", -203030934);
        setIntField(term1, term1.getClass(), "totalBasicSync", -1179120542);
        setIntField(term1, term1.getClass(), "totalAdvancedSync", -73683645);
        setIntField(term1, term1.getClass(), "totalExpertSync", -226514366);
        setIntField(term1, term1.getClass(), "totalMasterSync", 1193880199);
        setIntField(term1, term1.getClass(), "totalReMasterSync", -1087774327);
        setLongField(term1, term1.getClass(), "totalAchievement", 6967924379644551255L);
        setLongField(term1, term1.getClass(), "totalBasicAchievement", -2813493605142626659L);
        setLongField(term1, term1.getClass(), "totalAdvancedAchievement", -8885298608300233488L);
        setLongField(term1, term1.getClass(), "totalExpertAchievement", -4325723315152823407L);
        setLongField(term1, term1.getClass(), "totalMasterAchievement", 2535595959091595249L);
        setLongField(term1, term1.getClass(), "totalReMasterAchievement", -5476826692763582090L);
        setLongField(term1, term1.getClass(), "playerOldRating", -872011222785455006L);
        setLongField(term1, term1.getClass(), "playerNewRating", -316468845751588286L);
        setIntField(term1, term1.getClass(), "banState", -1530420153);
        setLongField(term1, term1.getClass(), "dateTime", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserAct");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


