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

public class UserDetail_setTotalMasterSync_1773928669142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4310599;
     Object term4310956;

    public UserDetail_setTotalMasterSync_1773928669142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4310603 = new Long(-5735359083132852428L);
        Integer term4310666 = new Integer(1644746758);
        Integer term4310668 = new Integer(-2021487528);
        Integer term4310670 = new Integer(-431095319);
        Integer term4310672 = new Integer(-532520843);
        Integer term4310674 = new Integer(1063976778);
        Integer term4310676 = new Integer(-2086752166);
        Integer term4310678 = new Integer(100476034);
        Integer term4310680 = new Integer(312816015);
        Integer term4310682 = new Integer(-1965641431);
        ArrayList term4310664 = new ArrayList();
        ((ArrayList) term4310664).add(term4310666);
        ((ArrayList) term4310664).add(term4310668);
        ((ArrayList) term4310664).add(term4310670);
        ((ArrayList) term4310664).add(term4310672);
        ((ArrayList) term4310664).add(term4310674);
        ((ArrayList) term4310664).add(term4310676);
        ((ArrayList) term4310664).add(term4310678);
        ((ArrayList) term4310664).add(term4310680);
        ((ArrayList) term4310664).add(term4310682);
        ArrayList term4310686 = new ArrayList();
        term4310599 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4310601 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4310617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4310618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4310622 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4310627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4310628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4310632 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4310599, term4310599.getClass(), "id", 9051697183320488186L);
        setLongField(term4310601, term4310601.getClass(), "id", -276156124851672489L);
        setField(term4310601, term4310601.getClass(), "extId", term4310603);
        setField(term4310601, term4310601.getClass(), "luid", "kJATTOSbOT");
        setIntField(term4310618, term4310618.getClass(), "year", 2023);
        setShortField(term4310618, term4310618.getClass(), "month", (short) 8);
        setShortField(term4310618, term4310618.getClass(), "day", (short) 18);
        setField(term4310617, term4310617.getClass(), "date", term4310618);
        setByteField(term4310622, term4310622.getClass(), "hour", (byte) 18);
        setByteField(term4310622, term4310622.getClass(), "minute", (byte) 20);
        setByteField(term4310622, term4310622.getClass(), "second", (byte) 26);
        setIntField(term4310622, term4310622.getClass(), "nano", 533477902);
        setField(term4310617, term4310617.getClass(), "time", term4310622);
        setField(term4310601, term4310601.getClass(), "registerTime", term4310617);
        setIntField(term4310628, term4310628.getClass(), "year", 2020);
        setShortField(term4310628, term4310628.getClass(), "month", (short) 4);
        setShortField(term4310628, term4310628.getClass(), "day", (short) 18);
        setField(term4310627, term4310627.getClass(), "date", term4310628);
        setByteField(term4310632, term4310632.getClass(), "hour", (byte) 14);
        setByteField(term4310632, term4310632.getClass(), "minute", (byte) 28);
        setByteField(term4310632, term4310632.getClass(), "second", (byte) 48);
        setIntField(term4310632, term4310632.getClass(), "nano", 897720757);
        setField(term4310627, term4310627.getClass(), "time", term4310632);
        setField(term4310601, term4310601.getClass(), "accessTime", term4310627);
        setField(term4310599, term4310599.getClass(), "card", term4310601);
        setField(term4310599, term4310599.getClass(), "userName", "gvDlVFPZAW");
        setIntField(term4310599, term4310599.getClass(), "isNetMember", 1638207152);
        setIntField(term4310599, term4310599.getClass(), "iconId", -638982422);
        setIntField(term4310599, term4310599.getClass(), "plateId", -783867864);
        setIntField(term4310599, term4310599.getClass(), "titleId", -504913231);
        setIntField(term4310599, term4310599.getClass(), "partnerId", 814000093);
        setIntField(term4310599, term4310599.getClass(), "frameId", -915290121);
        setIntField(term4310599, term4310599.getClass(), "selectMapId", 449903721);
        setIntField(term4310599, term4310599.getClass(), "totalAwake", 1660161771);
        setIntField(term4310599, term4310599.getClass(), "gradeRating", 51775970);
        setIntField(term4310599, term4310599.getClass(), "musicRating", 669226087);
        setIntField(term4310599, term4310599.getClass(), "playerRating", -882016993);
        setIntField(term4310599, term4310599.getClass(), "highestRating", 969266222);
        setIntField(term4310599, term4310599.getClass(), "gradeRank", -461371530);
        setIntField(term4310599, term4310599.getClass(), "classRank", -740296666);
        setIntField(term4310599, term4310599.getClass(), "courseRank", 1901705577);
        setField(term4310599, term4310599.getClass(), "charaSlot", term4310664);
        setField(term4310599, term4310599.getClass(), "charaLockSlot", term4310686);
        setLongField(term4310599, term4310599.getClass(), "contentBit", -8074631504989535999L);
        setIntField(term4310599, term4310599.getClass(), "playCount", 35798708);
        setField(term4310599, term4310599.getClass(), "eventWatchedDate", "bjxlEEopZY");
        setField(term4310599, term4310599.getClass(), "lastGameId", "XZPyJrNpOh");
        setField(term4310599, term4310599.getClass(), "lastRomVersion", "dliELHKMOu");
        setField(term4310599, term4310599.getClass(), "lastDataVersion", "lSxZcRhzaW");
        setField(term4310599, term4310599.getClass(), "lastLoginDate", "YWXzhRIvYp");
        setField(term4310599, term4310599.getClass(), "lastPlayDate", "SYgikTubFJ");
        setIntField(term4310599, term4310599.getClass(), "lastPlayCredit", 1032445154);
        setIntField(term4310599, term4310599.getClass(), "lastPlayMode", 243333096);
        setIntField(term4310599, term4310599.getClass(), "lastPlaceId", -1315583003);
        setField(term4310599, term4310599.getClass(), "lastPlaceName", "lzfYLgPsvq");
        setIntField(term4310599, term4310599.getClass(), "lastAllNetId", 1946400798);
        setIntField(term4310599, term4310599.getClass(), "lastRegionId", 380767975);
        setField(term4310599, term4310599.getClass(), "lastRegionName", "FIbCnQGNOQ");
        setField(term4310599, term4310599.getClass(), "lastClientId", "AIxlfxeEnr");
        setField(term4310599, term4310599.getClass(), "lastCountryCode", "ndgcyRrcer");
        setIntField(term4310599, term4310599.getClass(), "lastSelectEMoney", 1569173560);
        setIntField(term4310599, term4310599.getClass(), "lastSelectTicket", 763045422);
        setIntField(term4310599, term4310599.getClass(), "lastSelectCourse", -1454117208);
        setIntField(term4310599, term4310599.getClass(), "lastCountCourse", 1134154719);
        setField(term4310599, term4310599.getClass(), "firstGameId", "bmqdjDvmiD");
        setField(term4310599, term4310599.getClass(), "firstRomVersion", "mCuIEChXQz");
        setField(term4310599, term4310599.getClass(), "firstDataVersion", "yeriZMukHL");
        setField(term4310599, term4310599.getClass(), "firstPlayDate", "fotrRCKMcx");
        setField(term4310599, term4310599.getClass(), "compatibleCmVersion", "oPuNIvlpLP");
        setField(term4310599, term4310599.getClass(), "dailyBonusDate", "JLTLqieASr");
        setField(term4310599, term4310599.getClass(), "dailyCourseBonusDate", "GShuokfLmL");
        setField(term4310599, term4310599.getClass(), "lastPairLoginDate", "dfhPBUQkwy");
        setField(term4310599, term4310599.getClass(), "lastTrialPlayDate", "BiHBaoSkQn");
        setIntField(term4310599, term4310599.getClass(), "playVsCount", -1380027951);
        setIntField(term4310599, term4310599.getClass(), "playSyncCount", 1097210022);
        setIntField(term4310599, term4310599.getClass(), "winCount", -1127957604);
        setIntField(term4310599, term4310599.getClass(), "helpCount", -279221471);
        setIntField(term4310599, term4310599.getClass(), "comboCount", -294662356);
        setLongField(term4310599, term4310599.getClass(), "totalDeluxscore", -2122053386205032439L);
        setLongField(term4310599, term4310599.getClass(), "totalBasicDeluxscore", 4399259843627482493L);
        setLongField(term4310599, term4310599.getClass(), "totalAdvancedDeluxscore", 4008301688029553782L);
        setLongField(term4310599, term4310599.getClass(), "totalExpertDeluxscore", 2763425509633067653L);
        setLongField(term4310599, term4310599.getClass(), "totalMasterDeluxscore", -5152315401416568342L);
        setLongField(term4310599, term4310599.getClass(), "totalReMasterDeluxscore", 1472672890801026106L);
        setIntField(term4310599, term4310599.getClass(), "totalSync", 151622260);
        setIntField(term4310599, term4310599.getClass(), "totalBasicSync", 1538030859);
        setIntField(term4310599, term4310599.getClass(), "totalAdvancedSync", 2044987050);
        setIntField(term4310599, term4310599.getClass(), "totalExpertSync", -1278709926);
        setIntField(term4310599, term4310599.getClass(), "totalMasterSync", -1712300592);
        setIntField(term4310599, term4310599.getClass(), "totalReMasterSync", 1373755067);
        setLongField(term4310599, term4310599.getClass(), "totalAchievement", -6454522455750140572L);
        setLongField(term4310599, term4310599.getClass(), "totalBasicAchievement", -2176183639815879380L);
        setLongField(term4310599, term4310599.getClass(), "totalAdvancedAchievement", 212795954541557148L);
        setLongField(term4310599, term4310599.getClass(), "totalExpertAchievement", -7053189239581501700L);
        setLongField(term4310599, term4310599.getClass(), "totalMasterAchievement", 8782045560796851783L);
        setLongField(term4310599, term4310599.getClass(), "totalReMasterAchievement", -9168567116268680895L);
        setLongField(term4310599, term4310599.getClass(), "playerOldRating", -3514129432132998248L);
        setLongField(term4310599, term4310599.getClass(), "playerNewRating", -6449103490162212177L);
        setIntField(term4310599, term4310599.getClass(), "banState", -321901832);
        setLongField(term4310599, term4310599.getClass(), "dateTime", 1695562318213661194L);
        term4310956 = new Integer(352500243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4310956;
        callMethod(klass, "setTotalMasterSync", argTypes, term4310599, args);
    }

};


