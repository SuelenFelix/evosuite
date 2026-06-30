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

public class UserDetail_setDailyBonusDate_994231919124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265646;

    public UserDetail_setDailyBonusDate_994231919124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term265650 = new Long(-4855037955202452256L);
        Integer term265713 = new Integer(343920197);
        Integer term265715 = new Integer(-521630681);
        Integer term265717 = new Integer(1297681432);
        Integer term265719 = new Integer(820668311);
        Integer term265721 = new Integer(-43239204);
        Integer term265723 = new Integer(-1525054580);
        Integer term265725 = new Integer(1528804559);
        Integer term265727 = new Integer(-706860271);
        Integer term265729 = new Integer(-1268460209);
        ArrayList term265711 = new ArrayList();
        ((ArrayList) term265711).add(term265713);
        ((ArrayList) term265711).add(term265715);
        ((ArrayList) term265711).add(term265717);
        ((ArrayList) term265711).add(term265719);
        ((ArrayList) term265711).add(term265721);
        ((ArrayList) term265711).add(term265723);
        ((ArrayList) term265711).add(term265725);
        ((ArrayList) term265711).add(term265727);
        ((ArrayList) term265711).add(term265729);
        Integer term265735 = new Integer(1050300885);
        Integer term265737 = new Integer(-1623966228);
        Integer term265739 = new Integer(1085534206);
        Integer term265741 = new Integer(-825946504);
        Integer term265743 = new Integer(1618408809);
        Integer term265745 = new Integer(1511487617);
        Integer term265747 = new Integer(338598562);
        Integer term265749 = new Integer(1528748257);
        ArrayList term265733 = new ArrayList();
        ((ArrayList) term265733).add(term265735);
        ((ArrayList) term265733).add(term265737);
        ((ArrayList) term265733).add(term265739);
        ((ArrayList) term265733).add(term265741);
        ((ArrayList) term265733).add(term265743);
        ((ArrayList) term265733).add(term265745);
        ((ArrayList) term265733).add(term265747);
        ((ArrayList) term265733).add(term265749);
        term265646 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term265648 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term265664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term265665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term265669 = newInstance(Class.forName("java.time.LocalTime"));
        Object term265674 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term265675 = newInstance(Class.forName("java.time.LocalDate"));
        Object term265679 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term265646, term265646.getClass(), "id", -5112786717824112028L);
        setLongField(term265648, term265648.getClass(), "id", 7394369680521553467L);
        setField(term265648, term265648.getClass(), "extId", term265650);
        setField(term265648, term265648.getClass(), "luid", "UKoBRBiZED");
        setIntField(term265665, term265665.getClass(), "year", 2024);
        setShortField(term265665, term265665.getClass(), "month", (short) 11);
        setShortField(term265665, term265665.getClass(), "day", (short) 30);
        setField(term265664, term265664.getClass(), "date", term265665);
        setByteField(term265669, term265669.getClass(), "hour", (byte) 4);
        setByteField(term265669, term265669.getClass(), "minute", (byte) 23);
        setByteField(term265669, term265669.getClass(), "second", (byte) 32);
        setIntField(term265669, term265669.getClass(), "nano", 784828432);
        setField(term265664, term265664.getClass(), "time", term265669);
        setField(term265648, term265648.getClass(), "registerTime", term265664);
        setIntField(term265675, term265675.getClass(), "year", 2019);
        setShortField(term265675, term265675.getClass(), "month", (short) 1);
        setShortField(term265675, term265675.getClass(), "day", (short) 31);
        setField(term265674, term265674.getClass(), "date", term265675);
        setByteField(term265679, term265679.getClass(), "hour", (byte) 8);
        setByteField(term265679, term265679.getClass(), "minute", (byte) 28);
        setByteField(term265679, term265679.getClass(), "second", (byte) 32);
        setIntField(term265679, term265679.getClass(), "nano", 828700368);
        setField(term265674, term265674.getClass(), "time", term265679);
        setField(term265648, term265648.getClass(), "accessTime", term265674);
        setField(term265646, term265646.getClass(), "card", term265648);
        setField(term265646, term265646.getClass(), "userName", "QYLIYhaAna");
        setIntField(term265646, term265646.getClass(), "isNetMember", 168003679);
        setIntField(term265646, term265646.getClass(), "iconId", -511272275);
        setIntField(term265646, term265646.getClass(), "plateId", 1286033228);
        setIntField(term265646, term265646.getClass(), "titleId", 37500894);
        setIntField(term265646, term265646.getClass(), "partnerId", 503695686);
        setIntField(term265646, term265646.getClass(), "frameId", -1814609220);
        setIntField(term265646, term265646.getClass(), "selectMapId", 1195361675);
        setIntField(term265646, term265646.getClass(), "totalAwake", 1206774620);
        setIntField(term265646, term265646.getClass(), "gradeRating", -1666994610);
        setIntField(term265646, term265646.getClass(), "musicRating", 1170271662);
        setIntField(term265646, term265646.getClass(), "playerRating", 1879274593);
        setIntField(term265646, term265646.getClass(), "highestRating", -10590168);
        setIntField(term265646, term265646.getClass(), "gradeRank", 1187185068);
        setIntField(term265646, term265646.getClass(), "classRank", 884648970);
        setIntField(term265646, term265646.getClass(), "courseRank", 1798950422);
        setField(term265646, term265646.getClass(), "charaSlot", term265711);
        setField(term265646, term265646.getClass(), "charaLockSlot", term265733);
        setLongField(term265646, term265646.getClass(), "contentBit", -8511823382790310363L);
        setIntField(term265646, term265646.getClass(), "playCount", -934527554);
        setField(term265646, term265646.getClass(), "eventWatchedDate", "HzMfMKgKlf");
        setField(term265646, term265646.getClass(), "lastGameId", "syeDEkvOkO");
        setField(term265646, term265646.getClass(), "lastRomVersion", "sgApZzdiHM");
        setField(term265646, term265646.getClass(), "lastDataVersion", "vAEHmJcPSd");
        setField(term265646, term265646.getClass(), "lastLoginDate", "dOvqKQlKUa");
        setField(term265646, term265646.getClass(), "lastPlayDate", "ZjyndZHfXg");
        setIntField(term265646, term265646.getClass(), "lastPlayCredit", 283508422);
        setIntField(term265646, term265646.getClass(), "lastPlayMode", 288863000);
        setIntField(term265646, term265646.getClass(), "lastPlaceId", 1431879138);
        setField(term265646, term265646.getClass(), "lastPlaceName", "mWarigMEMX");
        setIntField(term265646, term265646.getClass(), "lastAllNetId", -2046261620);
        setIntField(term265646, term265646.getClass(), "lastRegionId", -374355651);
        setField(term265646, term265646.getClass(), "lastRegionName", "UbOEkDKQTT");
        setField(term265646, term265646.getClass(), "lastClientId", "IWWuxiwNhE");
        setField(term265646, term265646.getClass(), "lastCountryCode", "tecOgyBctJ");
        setIntField(term265646, term265646.getClass(), "lastSelectEMoney", -1213488752);
        setIntField(term265646, term265646.getClass(), "lastSelectTicket", -847273841);
        setIntField(term265646, term265646.getClass(), "lastSelectCourse", -1067049532);
        setIntField(term265646, term265646.getClass(), "lastCountCourse", 1636487213);
        setField(term265646, term265646.getClass(), "firstGameId", "rSSuONUDGA");
        setField(term265646, term265646.getClass(), "firstRomVersion", "WmInSFSxSk");
        setField(term265646, term265646.getClass(), "firstDataVersion", "rmbZwfUyua");
        setField(term265646, term265646.getClass(), "firstPlayDate", "GzCjLjIGCd");
        setField(term265646, term265646.getClass(), "compatibleCmVersion", "oYSEWvyjcR");
        setField(term265646, term265646.getClass(), "dailyBonusDate", "VMmhmTHSAL");
        setField(term265646, term265646.getClass(), "dailyCourseBonusDate", "XGtrhXNaMV");
        setField(term265646, term265646.getClass(), "lastPairLoginDate", "KlhHeZgItV");
        setField(term265646, term265646.getClass(), "lastTrialPlayDate", "YGWvExlOFa");
        setIntField(term265646, term265646.getClass(), "playVsCount", -1975395435);
        setIntField(term265646, term265646.getClass(), "playSyncCount", 1108779869);
        setIntField(term265646, term265646.getClass(), "winCount", -1526342029);
        setIntField(term265646, term265646.getClass(), "helpCount", 926654899);
        setIntField(term265646, term265646.getClass(), "comboCount", -1424346655);
        setLongField(term265646, term265646.getClass(), "totalDeluxscore", -455412652094118573L);
        setLongField(term265646, term265646.getClass(), "totalBasicDeluxscore", -693011621792110410L);
        setLongField(term265646, term265646.getClass(), "totalAdvancedDeluxscore", 7399897939384962727L);
        setLongField(term265646, term265646.getClass(), "totalExpertDeluxscore", -7483777678852087471L);
        setLongField(term265646, term265646.getClass(), "totalMasterDeluxscore", 3611599920923632705L);
        setLongField(term265646, term265646.getClass(), "totalReMasterDeluxscore", 6951838095340097487L);
        setIntField(term265646, term265646.getClass(), "totalSync", 1992994085);
        setIntField(term265646, term265646.getClass(), "totalBasicSync", -1942011950);
        setIntField(term265646, term265646.getClass(), "totalAdvancedSync", -523308369);
        setIntField(term265646, term265646.getClass(), "totalExpertSync", 1162627136);
        setIntField(term265646, term265646.getClass(), "totalMasterSync", -1275316800);
        setIntField(term265646, term265646.getClass(), "totalReMasterSync", 151380700);
        setLongField(term265646, term265646.getClass(), "totalAchievement", -5470583704778763979L);
        setLongField(term265646, term265646.getClass(), "totalBasicAchievement", -7892236256492456815L);
        setLongField(term265646, term265646.getClass(), "totalAdvancedAchievement", -5878274573505968598L);
        setLongField(term265646, term265646.getClass(), "totalExpertAchievement", -7179962669306447196L);
        setLongField(term265646, term265646.getClass(), "totalMasterAchievement", 6185842529763056152L);
        setLongField(term265646, term265646.getClass(), "totalReMasterAchievement", -7881011809148121056L);
        setLongField(term265646, term265646.getClass(), "playerOldRating", 764914334968214354L);
        setLongField(term265646, term265646.getClass(), "playerNewRating", 3084530353378648272L);
        setIntField(term265646, term265646.getClass(), "banState", 1777983178);
        setLongField(term265646, term265646.getClass(), "dateTime", -4596852458061284153L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DtiQRHgJmm";
        callMethod(klass, "setDailyBonusDate", argTypes, term265646, args);
    }

};


