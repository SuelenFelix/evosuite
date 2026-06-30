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

public class UserDetail_setSelectMapId_61693572186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4278344;
     Object term4278691;

    public UserDetail_setSelectMapId_61693572186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4278348 = new Long(-1391513918138897073L);
        Integer term4278411 = new Integer(5339448);
        ArrayList term4278409 = new ArrayList();
        ((ArrayList) term4278409).add(term4278411);
        Integer term4278417 = new Integer(-1354552611);
        Integer term4278419 = new Integer(1188745205);
        Integer term4278421 = new Integer(1472049184);
        ArrayList term4278415 = new ArrayList();
        ((ArrayList) term4278415).add(term4278417);
        ((ArrayList) term4278415).add(term4278419);
        ((ArrayList) term4278415).add(term4278421);
        term4278344 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4278346 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4278362 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4278363 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4278367 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4278372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4278373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4278377 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4278344, term4278344.getClass(), "id", 4389582325198049782L);
        setLongField(term4278346, term4278346.getClass(), "id", 7593637505524714325L);
        setField(term4278346, term4278346.getClass(), "extId", term4278348);
        setField(term4278346, term4278346.getClass(), "luid", "GHMdNEPIcy");
        setIntField(term4278363, term4278363.getClass(), "year", 2015);
        setShortField(term4278363, term4278363.getClass(), "month", (short) 1);
        setShortField(term4278363, term4278363.getClass(), "day", (short) 28);
        setField(term4278362, term4278362.getClass(), "date", term4278363);
        setByteField(term4278367, term4278367.getClass(), "hour", (byte) 9);
        setByteField(term4278367, term4278367.getClass(), "minute", (byte) 51);
        setByteField(term4278367, term4278367.getClass(), "second", (byte) 16);
        setIntField(term4278367, term4278367.getClass(), "nano", 31868208);
        setField(term4278362, term4278362.getClass(), "time", term4278367);
        setField(term4278346, term4278346.getClass(), "registerTime", term4278362);
        setIntField(term4278373, term4278373.getClass(), "year", 2028);
        setShortField(term4278373, term4278373.getClass(), "month", (short) 6);
        setShortField(term4278373, term4278373.getClass(), "day", (short) 14);
        setField(term4278372, term4278372.getClass(), "date", term4278373);
        setByteField(term4278377, term4278377.getClass(), "hour", (byte) 0);
        setByteField(term4278377, term4278377.getClass(), "minute", (byte) 44);
        setByteField(term4278377, term4278377.getClass(), "second", (byte) 46);
        setIntField(term4278377, term4278377.getClass(), "nano", 747960223);
        setField(term4278372, term4278372.getClass(), "time", term4278377);
        setField(term4278346, term4278346.getClass(), "accessTime", term4278372);
        setField(term4278344, term4278344.getClass(), "card", term4278346);
        setField(term4278344, term4278344.getClass(), "userName", "ZFtFcOqUQf");
        setIntField(term4278344, term4278344.getClass(), "isNetMember", -341711033);
        setIntField(term4278344, term4278344.getClass(), "iconId", 565752348);
        setIntField(term4278344, term4278344.getClass(), "plateId", -1264347437);
        setIntField(term4278344, term4278344.getClass(), "titleId", -909449679);
        setIntField(term4278344, term4278344.getClass(), "partnerId", -1107234359);
        setIntField(term4278344, term4278344.getClass(), "frameId", -136669635);
        setIntField(term4278344, term4278344.getClass(), "selectMapId", 392940997);
        setIntField(term4278344, term4278344.getClass(), "totalAwake", 1589265988);
        setIntField(term4278344, term4278344.getClass(), "gradeRating", -834979188);
        setIntField(term4278344, term4278344.getClass(), "musicRating", -1649410598);
        setIntField(term4278344, term4278344.getClass(), "playerRating", 2064541650);
        setIntField(term4278344, term4278344.getClass(), "highestRating", 599121424);
        setIntField(term4278344, term4278344.getClass(), "gradeRank", -426618203);
        setIntField(term4278344, term4278344.getClass(), "classRank", -1054948424);
        setIntField(term4278344, term4278344.getClass(), "courseRank", -575126408);
        setField(term4278344, term4278344.getClass(), "charaSlot", term4278409);
        setField(term4278344, term4278344.getClass(), "charaLockSlot", term4278415);
        setLongField(term4278344, term4278344.getClass(), "contentBit", 4003505506660275738L);
        setIntField(term4278344, term4278344.getClass(), "playCount", -1348493873);
        setField(term4278344, term4278344.getClass(), "eventWatchedDate", "eoQzyALsxJ");
        setField(term4278344, term4278344.getClass(), "lastGameId", "LtUSyVatZM");
        setField(term4278344, term4278344.getClass(), "lastRomVersion", "spKGxldcmI");
        setField(term4278344, term4278344.getClass(), "lastDataVersion", "XwBQwRfIHH");
        setField(term4278344, term4278344.getClass(), "lastLoginDate", "gQoVjUvwnR");
        setField(term4278344, term4278344.getClass(), "lastPlayDate", "TlXxTctqkY");
        setIntField(term4278344, term4278344.getClass(), "lastPlayCredit", 281166826);
        setIntField(term4278344, term4278344.getClass(), "lastPlayMode", -1433396963);
        setIntField(term4278344, term4278344.getClass(), "lastPlaceId", 467744699);
        setField(term4278344, term4278344.getClass(), "lastPlaceName", "Jtfmlxjxgb");
        setIntField(term4278344, term4278344.getClass(), "lastAllNetId", 1813052731);
        setIntField(term4278344, term4278344.getClass(), "lastRegionId", -253053297);
        setField(term4278344, term4278344.getClass(), "lastRegionName", "OxazDNPYTD");
        setField(term4278344, term4278344.getClass(), "lastClientId", "QYIaPIDfxb");
        setField(term4278344, term4278344.getClass(), "lastCountryCode", "mtTPcLLsup");
        setIntField(term4278344, term4278344.getClass(), "lastSelectEMoney", 1429660837);
        setIntField(term4278344, term4278344.getClass(), "lastSelectTicket", -1025187220);
        setIntField(term4278344, term4278344.getClass(), "lastSelectCourse", -378787707);
        setIntField(term4278344, term4278344.getClass(), "lastCountCourse", 137514259);
        setField(term4278344, term4278344.getClass(), "firstGameId", "xsGuybVkcc");
        setField(term4278344, term4278344.getClass(), "firstRomVersion", "SvQrCwdPtr");
        setField(term4278344, term4278344.getClass(), "firstDataVersion", "SojUclmSmD");
        setField(term4278344, term4278344.getClass(), "firstPlayDate", "sWqiVGluVz");
        setField(term4278344, term4278344.getClass(), "compatibleCmVersion", "emIOvdCvRl");
        setField(term4278344, term4278344.getClass(), "dailyBonusDate", "OAYJuAwYqn");
        setField(term4278344, term4278344.getClass(), "dailyCourseBonusDate", "uUOvuaqNib");
        setField(term4278344, term4278344.getClass(), "lastPairLoginDate", "FacXeCeyYe");
        setField(term4278344, term4278344.getClass(), "lastTrialPlayDate", "nYHSVHkpec");
        setIntField(term4278344, term4278344.getClass(), "playVsCount", 22854229);
        setIntField(term4278344, term4278344.getClass(), "playSyncCount", -1927656787);
        setIntField(term4278344, term4278344.getClass(), "winCount", -107050868);
        setIntField(term4278344, term4278344.getClass(), "helpCount", -2014750116);
        setIntField(term4278344, term4278344.getClass(), "comboCount", 1795014896);
        setLongField(term4278344, term4278344.getClass(), "totalDeluxscore", -5019065412916898884L);
        setLongField(term4278344, term4278344.getClass(), "totalBasicDeluxscore", 1380566231202356712L);
        setLongField(term4278344, term4278344.getClass(), "totalAdvancedDeluxscore", 881285773384130193L);
        setLongField(term4278344, term4278344.getClass(), "totalExpertDeluxscore", -2756737602517415659L);
        setLongField(term4278344, term4278344.getClass(), "totalMasterDeluxscore", -6938523149729580537L);
        setLongField(term4278344, term4278344.getClass(), "totalReMasterDeluxscore", 8102080182991036314L);
        setIntField(term4278344, term4278344.getClass(), "totalSync", -206702413);
        setIntField(term4278344, term4278344.getClass(), "totalBasicSync", 1015487051);
        setIntField(term4278344, term4278344.getClass(), "totalAdvancedSync", 1117738529);
        setIntField(term4278344, term4278344.getClass(), "totalExpertSync", -1163061111);
        setIntField(term4278344, term4278344.getClass(), "totalMasterSync", -595944499);
        setIntField(term4278344, term4278344.getClass(), "totalReMasterSync", 1629899154);
        setLongField(term4278344, term4278344.getClass(), "totalAchievement", -3805357773354114355L);
        setLongField(term4278344, term4278344.getClass(), "totalBasicAchievement", 3229734414620322232L);
        setLongField(term4278344, term4278344.getClass(), "totalAdvancedAchievement", -3571695421868636746L);
        setLongField(term4278344, term4278344.getClass(), "totalExpertAchievement", -307871152184425412L);
        setLongField(term4278344, term4278344.getClass(), "totalMasterAchievement", 1154030327618615195L);
        setLongField(term4278344, term4278344.getClass(), "totalReMasterAchievement", 4027625014781342980L);
        setLongField(term4278344, term4278344.getClass(), "playerOldRating", 2101156569208129407L);
        setLongField(term4278344, term4278344.getClass(), "playerNewRating", -819921852824419391L);
        setIntField(term4278344, term4278344.getClass(), "banState", 569422727);
        setLongField(term4278344, term4278344.getClass(), "dateTime", 8117124380246757109L);
        term4278691 = new Integer(-1270835623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4278691;
        callMethod(klass, "setSelectMapId", argTypes, term4278344, args);
    }

};


