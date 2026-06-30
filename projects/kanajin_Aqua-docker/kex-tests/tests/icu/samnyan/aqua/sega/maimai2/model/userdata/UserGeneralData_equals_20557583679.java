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

public class UserGeneralData_equals_20557583679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138293;
     Object term138676;

    public UserGeneralData_equals_20557583679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term138299 = new Long(-419800263764810394L);
        Integer term138362 = new Integer(-438794741);
        Integer term138364 = new Integer(-1400834481);
        Integer term138366 = new Integer(957091706);
        Integer term138368 = new Integer(-2011802805);
        Integer term138370 = new Integer(-1683802689);
        Integer term138372 = new Integer(-1949346221);
        ArrayList term138360 = new ArrayList();
        ((ArrayList) term138360).add(term138362);
        ((ArrayList) term138360).add(term138364);
        ((ArrayList) term138360).add(term138366);
        ((ArrayList) term138360).add(term138368);
        ((ArrayList) term138360).add(term138370);
        ((ArrayList) term138360).add(term138372);
        Integer term138378 = new Integer(831638391);
        Integer term138380 = new Integer(-1184374392);
        Integer term138382 = new Integer(-758870402);
        ArrayList term138376 = new ArrayList();
        ((ArrayList) term138376).add(term138378);
        ((ArrayList) term138376).add(term138380);
        ((ArrayList) term138376).add(term138382);
        term138293 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term138295 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term138297 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term138313 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138314 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138318 = newInstance(Class.forName("java.time.LocalTime"));
        Object term138323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term138324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term138328 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term138293, term138293.getClass(), "id", 6820162780633729573L);
        setLongField(term138295, term138295.getClass(), "id", -4641746681583770460L);
        setLongField(term138297, term138297.getClass(), "id", 6860967281797221882L);
        setField(term138297, term138297.getClass(), "extId", term138299);
        setField(term138297, term138297.getClass(), "luid", "SDJXoYNVym");
        setIntField(term138314, term138314.getClass(), "year", 2027);
        setShortField(term138314, term138314.getClass(), "month", (short) 9);
        setShortField(term138314, term138314.getClass(), "day", (short) 19);
        setField(term138313, term138313.getClass(), "date", term138314);
        setByteField(term138318, term138318.getClass(), "hour", (byte) 13);
        setByteField(term138318, term138318.getClass(), "minute", (byte) 17);
        setByteField(term138318, term138318.getClass(), "second", (byte) 43);
        setIntField(term138318, term138318.getClass(), "nano", 359493485);
        setField(term138313, term138313.getClass(), "time", term138318);
        setField(term138297, term138297.getClass(), "registerTime", term138313);
        setIntField(term138324, term138324.getClass(), "year", 2028);
        setShortField(term138324, term138324.getClass(), "month", (short) 2);
        setShortField(term138324, term138324.getClass(), "day", (short) 3);
        setField(term138323, term138323.getClass(), "date", term138324);
        setByteField(term138328, term138328.getClass(), "hour", (byte) 14);
        setByteField(term138328, term138328.getClass(), "minute", (byte) 31);
        setByteField(term138328, term138328.getClass(), "second", (byte) 5);
        setIntField(term138328, term138328.getClass(), "nano", 770924836);
        setField(term138323, term138323.getClass(), "time", term138328);
        setField(term138297, term138297.getClass(), "accessTime", term138323);
        setField(term138295, term138295.getClass(), "card", term138297);
        setField(term138295, term138295.getClass(), "userName", "ownnefVcXK");
        setIntField(term138295, term138295.getClass(), "isNetMember", -2061313449);
        setIntField(term138295, term138295.getClass(), "iconId", 1235250395);
        setIntField(term138295, term138295.getClass(), "plateId", -554298931);
        setIntField(term138295, term138295.getClass(), "titleId", 1776900753);
        setIntField(term138295, term138295.getClass(), "partnerId", 77426182);
        setIntField(term138295, term138295.getClass(), "frameId", -395423165);
        setIntField(term138295, term138295.getClass(), "selectMapId", -990526245);
        setIntField(term138295, term138295.getClass(), "totalAwake", 2133565885);
        setIntField(term138295, term138295.getClass(), "gradeRating", -1197317011);
        setIntField(term138295, term138295.getClass(), "musicRating", -622026055);
        setIntField(term138295, term138295.getClass(), "playerRating", -253994513);
        setIntField(term138295, term138295.getClass(), "highestRating", -797621149);
        setIntField(term138295, term138295.getClass(), "gradeRank", 1348878482);
        setIntField(term138295, term138295.getClass(), "classRank", 1839647396);
        setIntField(term138295, term138295.getClass(), "courseRank", 749558175);
        setField(term138295, term138295.getClass(), "charaSlot", term138360);
        setField(term138295, term138295.getClass(), "charaLockSlot", term138376);
        setLongField(term138295, term138295.getClass(), "contentBit", 2530727598607906762L);
        setIntField(term138295, term138295.getClass(), "playCount", -249093225);
        setField(term138295, term138295.getClass(), "eventWatchedDate", "KAtvRoxPvL");
        setField(term138295, term138295.getClass(), "lastGameId", "DfiGFdKcma");
        setField(term138295, term138295.getClass(), "lastRomVersion", "rUpZXYuqUO");
        setField(term138295, term138295.getClass(), "lastDataVersion", "PyCZLyLBQT");
        setField(term138295, term138295.getClass(), "lastLoginDate", "IVHMBjnDQQ");
        setField(term138295, term138295.getClass(), "lastPlayDate", "CjQVEkBwOV");
        setIntField(term138295, term138295.getClass(), "lastPlayCredit", 1664707074);
        setIntField(term138295, term138295.getClass(), "lastPlayMode", -1965724215);
        setIntField(term138295, term138295.getClass(), "lastPlaceId", -2029902121);
        setField(term138295, term138295.getClass(), "lastPlaceName", "IMmDkISmvo");
        setIntField(term138295, term138295.getClass(), "lastAllNetId", -1095782854);
        setIntField(term138295, term138295.getClass(), "lastRegionId", 1432496573);
        setField(term138295, term138295.getClass(), "lastRegionName", "LBkNRvzfMR");
        setField(term138295, term138295.getClass(), "lastClientId", "AGyEIGYbwx");
        setField(term138295, term138295.getClass(), "lastCountryCode", "nOkegthvTo");
        setIntField(term138295, term138295.getClass(), "lastSelectEMoney", -849194186);
        setIntField(term138295, term138295.getClass(), "lastSelectTicket", 534005485);
        setIntField(term138295, term138295.getClass(), "lastSelectCourse", 433949054);
        setIntField(term138295, term138295.getClass(), "lastCountCourse", 1432683121);
        setField(term138295, term138295.getClass(), "firstGameId", "QIBFEnRCeZ");
        setField(term138295, term138295.getClass(), "firstRomVersion", "HVMLhVrWly");
        setField(term138295, term138295.getClass(), "firstDataVersion", "yVHTwpMOSD");
        setField(term138295, term138295.getClass(), "firstPlayDate", "ZFThLVgXzT");
        setField(term138295, term138295.getClass(), "compatibleCmVersion", "wpSuVLuVSu");
        setField(term138295, term138295.getClass(), "dailyBonusDate", "BauBYWlTXL");
        setField(term138295, term138295.getClass(), "dailyCourseBonusDate", "dAoPTQFCFN");
        setField(term138295, term138295.getClass(), "lastPairLoginDate", "AAVsuSsxLS");
        setField(term138295, term138295.getClass(), "lastTrialPlayDate", "ElCmThplmP");
        setIntField(term138295, term138295.getClass(), "playVsCount", -1075532959);
        setIntField(term138295, term138295.getClass(), "playSyncCount", -2112121102);
        setIntField(term138295, term138295.getClass(), "winCount", 882228649);
        setIntField(term138295, term138295.getClass(), "helpCount", 1534973931);
        setIntField(term138295, term138295.getClass(), "comboCount", 1939412111);
        setLongField(term138295, term138295.getClass(), "totalDeluxscore", -2597592144853921265L);
        setLongField(term138295, term138295.getClass(), "totalBasicDeluxscore", -8521325756515386498L);
        setLongField(term138295, term138295.getClass(), "totalAdvancedDeluxscore", 6474942275917422051L);
        setLongField(term138295, term138295.getClass(), "totalExpertDeluxscore", 4247659213519223373L);
        setLongField(term138295, term138295.getClass(), "totalMasterDeluxscore", -296476928996372669L);
        setLongField(term138295, term138295.getClass(), "totalReMasterDeluxscore", 1927259353051624285L);
        setIntField(term138295, term138295.getClass(), "totalSync", -2088107446);
        setIntField(term138295, term138295.getClass(), "totalBasicSync", 590965528);
        setIntField(term138295, term138295.getClass(), "totalAdvancedSync", -901801526);
        setIntField(term138295, term138295.getClass(), "totalExpertSync", -844430982);
        setIntField(term138295, term138295.getClass(), "totalMasterSync", -164393345);
        setIntField(term138295, term138295.getClass(), "totalReMasterSync", 994265990);
        setLongField(term138295, term138295.getClass(), "totalAchievement", 2269810715973470447L);
        setLongField(term138295, term138295.getClass(), "totalBasicAchievement", 2074310247922885552L);
        setLongField(term138295, term138295.getClass(), "totalAdvancedAchievement", 7164501104889735038L);
        setLongField(term138295, term138295.getClass(), "totalExpertAchievement", -4035005105175421014L);
        setLongField(term138295, term138295.getClass(), "totalMasterAchievement", 663332377552363646L);
        setLongField(term138295, term138295.getClass(), "totalReMasterAchievement", 4503825086123868368L);
        setLongField(term138295, term138295.getClass(), "playerOldRating", 1115062833068978142L);
        setLongField(term138295, term138295.getClass(), "playerNewRating", 3131583923379710930L);
        setIntField(term138295, term138295.getClass(), "banState", 1551328629);
        setLongField(term138295, term138295.getClass(), "dateTime", 1005731301559613328L);
        setField(term138293, term138293.getClass(), "user", term138295);
        setField(term138293, term138293.getClass(), "propertyKey", "QmHpkkQsav");
        setField(term138293, term138293.getClass(), "propertyValue", "hMSzYZiZXX");
        term138676 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term138676;
        callMethod(klass, "equals", argTypes, term138293, args);
    }

};


