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

public class UserUdemae_getNpcMaxLoseNum_3835805816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103723;

    public UserUdemae_getNpcMaxLoseNum_3835805816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term103729 = new Long(-8121849829073967555L);
        Integer term103792 = new Integer(370671198);
        Integer term103794 = new Integer(1426800646);
        ArrayList term103790 = new ArrayList();
        ((ArrayList) term103790).add(term103792);
        ((ArrayList) term103790).add(term103794);
        Integer term103800 = new Integer(954234820);
        Integer term103802 = new Integer(1047346538);
        Integer term103804 = new Integer(728436340);
        Integer term103806 = new Integer(1841731593);
        Integer term103808 = new Integer(-1854929057);
        Integer term103810 = new Integer(1703814701);
        Integer term103812 = new Integer(1370246522);
        Integer term103814 = new Integer(-574611924);
        ArrayList term103798 = new ArrayList();
        ((ArrayList) term103798).add(term103800);
        ((ArrayList) term103798).add(term103802);
        ((ArrayList) term103798).add(term103804);
        ((ArrayList) term103798).add(term103806);
        ((ArrayList) term103798).add(term103808);
        ((ArrayList) term103798).add(term103810);
        ((ArrayList) term103798).add(term103812);
        ((ArrayList) term103798).add(term103814);
        term103723 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term103725 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term103727 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term103743 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103744 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103748 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103758 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term103723, term103723.getClass(), "id", -8496380081001714297L);
        setLongField(term103725, term103725.getClass(), "id", -5796471103228499506L);
        setLongField(term103727, term103727.getClass(), "id", -8448744088477595154L);
        setField(term103727, term103727.getClass(), "extId", term103729);
        setField(term103727, term103727.getClass(), "luid", "PwXoorKXoP");
        setIntField(term103744, term103744.getClass(), "year", 2023);
        setShortField(term103744, term103744.getClass(), "month", (short) 5);
        setShortField(term103744, term103744.getClass(), "day", (short) 8);
        setField(term103743, term103743.getClass(), "date", term103744);
        setByteField(term103748, term103748.getClass(), "hour", (byte) 6);
        setByteField(term103748, term103748.getClass(), "minute", (byte) 35);
        setByteField(term103748, term103748.getClass(), "second", (byte) 9);
        setIntField(term103748, term103748.getClass(), "nano", 577816079);
        setField(term103743, term103743.getClass(), "time", term103748);
        setField(term103727, term103727.getClass(), "registerTime", term103743);
        setIntField(term103754, term103754.getClass(), "year", 2019);
        setShortField(term103754, term103754.getClass(), "month", (short) 12);
        setShortField(term103754, term103754.getClass(), "day", (short) 13);
        setField(term103753, term103753.getClass(), "date", term103754);
        setByteField(term103758, term103758.getClass(), "hour", (byte) 7);
        setByteField(term103758, term103758.getClass(), "minute", (byte) 59);
        setByteField(term103758, term103758.getClass(), "second", (byte) 40);
        setIntField(term103758, term103758.getClass(), "nano", 824164134);
        setField(term103753, term103753.getClass(), "time", term103758);
        setField(term103727, term103727.getClass(), "accessTime", term103753);
        setField(term103725, term103725.getClass(), "card", term103727);
        setField(term103725, term103725.getClass(), "userName", "FTbhYKJKQL");
        setIntField(term103725, term103725.getClass(), "isNetMember", -613970307);
        setIntField(term103725, term103725.getClass(), "iconId", 2045590105);
        setIntField(term103725, term103725.getClass(), "plateId", -2052631286);
        setIntField(term103725, term103725.getClass(), "titleId", -1474168411);
        setIntField(term103725, term103725.getClass(), "partnerId", -233688868);
        setIntField(term103725, term103725.getClass(), "frameId", 1222014341);
        setIntField(term103725, term103725.getClass(), "selectMapId", -2043344667);
        setIntField(term103725, term103725.getClass(), "totalAwake", 1173313312);
        setIntField(term103725, term103725.getClass(), "gradeRating", 1956926414);
        setIntField(term103725, term103725.getClass(), "musicRating", -1787169684);
        setIntField(term103725, term103725.getClass(), "playerRating", 1564406673);
        setIntField(term103725, term103725.getClass(), "highestRating", 1505760902);
        setIntField(term103725, term103725.getClass(), "gradeRank", 1276810708);
        setIntField(term103725, term103725.getClass(), "classRank", -375398621);
        setIntField(term103725, term103725.getClass(), "courseRank", 856069240);
        setField(term103725, term103725.getClass(), "charaSlot", term103790);
        setField(term103725, term103725.getClass(), "charaLockSlot", term103798);
        setLongField(term103725, term103725.getClass(), "contentBit", 5936677913610437976L);
        setIntField(term103725, term103725.getClass(), "playCount", 1617630705);
        setField(term103725, term103725.getClass(), "eventWatchedDate", "CssqWIyxap");
        setField(term103725, term103725.getClass(), "lastGameId", "EtmaqZMoVN");
        setField(term103725, term103725.getClass(), "lastRomVersion", "mluXYJByNP");
        setField(term103725, term103725.getClass(), "lastDataVersion", "kLMqANSDgO");
        setField(term103725, term103725.getClass(), "lastLoginDate", "nStYnHGCom");
        setField(term103725, term103725.getClass(), "lastPlayDate", "gfqZitqjcH");
        setIntField(term103725, term103725.getClass(), "lastPlayCredit", -2035560140);
        setIntField(term103725, term103725.getClass(), "lastPlayMode", 532665626);
        setIntField(term103725, term103725.getClass(), "lastPlaceId", 1052620858);
        setField(term103725, term103725.getClass(), "lastPlaceName", "QfJOLCTCHY");
        setIntField(term103725, term103725.getClass(), "lastAllNetId", 784368731);
        setIntField(term103725, term103725.getClass(), "lastRegionId", -325400272);
        setField(term103725, term103725.getClass(), "lastRegionName", "yNQuuhZyAX");
        setField(term103725, term103725.getClass(), "lastClientId", "IqzRlGAXKQ");
        setField(term103725, term103725.getClass(), "lastCountryCode", "XiytdmxGYa");
        setIntField(term103725, term103725.getClass(), "lastSelectEMoney", -439065543);
        setIntField(term103725, term103725.getClass(), "lastSelectTicket", -2067100921);
        setIntField(term103725, term103725.getClass(), "lastSelectCourse", -630380701);
        setIntField(term103725, term103725.getClass(), "lastCountCourse", -1571228038);
        setField(term103725, term103725.getClass(), "firstGameId", "xuWbTDWaJN");
        setField(term103725, term103725.getClass(), "firstRomVersion", "LvZCXbeNaa");
        setField(term103725, term103725.getClass(), "firstDataVersion", "CaxKtuZUJI");
        setField(term103725, term103725.getClass(), "firstPlayDate", "wokzuoOQRu");
        setField(term103725, term103725.getClass(), "compatibleCmVersion", "jIVcJcAtbp");
        setField(term103725, term103725.getClass(), "dailyBonusDate", "eugajHLhOv");
        setField(term103725, term103725.getClass(), "dailyCourseBonusDate", "sCSkTLnMUp");
        setField(term103725, term103725.getClass(), "lastPairLoginDate", "MGfUFAWSlA");
        setField(term103725, term103725.getClass(), "lastTrialPlayDate", "eCRXbBPOdv");
        setIntField(term103725, term103725.getClass(), "playVsCount", 483151429);
        setIntField(term103725, term103725.getClass(), "playSyncCount", -292946895);
        setIntField(term103725, term103725.getClass(), "winCount", -1582974640);
        setIntField(term103725, term103725.getClass(), "helpCount", -425384218);
        setIntField(term103725, term103725.getClass(), "comboCount", -1593819000);
        setLongField(term103725, term103725.getClass(), "totalDeluxscore", -7717851618699599254L);
        setLongField(term103725, term103725.getClass(), "totalBasicDeluxscore", -7620925860140899942L);
        setLongField(term103725, term103725.getClass(), "totalAdvancedDeluxscore", -1724240476349102238L);
        setLongField(term103725, term103725.getClass(), "totalExpertDeluxscore", -7264050965874537139L);
        setLongField(term103725, term103725.getClass(), "totalMasterDeluxscore", -3852768873412739872L);
        setLongField(term103725, term103725.getClass(), "totalReMasterDeluxscore", 2712970677838289717L);
        setIntField(term103725, term103725.getClass(), "totalSync", -358856964);
        setIntField(term103725, term103725.getClass(), "totalBasicSync", -367287466);
        setIntField(term103725, term103725.getClass(), "totalAdvancedSync", 784852065);
        setIntField(term103725, term103725.getClass(), "totalExpertSync", 358212017);
        setIntField(term103725, term103725.getClass(), "totalMasterSync", -1993296712);
        setIntField(term103725, term103725.getClass(), "totalReMasterSync", -1609787368);
        setLongField(term103725, term103725.getClass(), "totalAchievement", -6168541673690224010L);
        setLongField(term103725, term103725.getClass(), "totalBasicAchievement", -1730227990793261400L);
        setLongField(term103725, term103725.getClass(), "totalAdvancedAchievement", 6980156273711850847L);
        setLongField(term103725, term103725.getClass(), "totalExpertAchievement", 7999738434372521040L);
        setLongField(term103725, term103725.getClass(), "totalMasterAchievement", 8493039976562850019L);
        setLongField(term103725, term103725.getClass(), "totalReMasterAchievement", -4375263216052145361L);
        setLongField(term103725, term103725.getClass(), "playerOldRating", 3225363048280133888L);
        setLongField(term103725, term103725.getClass(), "playerNewRating", 8856252785841406435L);
        setIntField(term103725, term103725.getClass(), "banState", -1900357855);
        setLongField(term103725, term103725.getClass(), "dateTime", 8758451103376419654L);
        setField(term103723, term103723.getClass(), "user", term103725);
        setIntField(term103723, term103723.getClass(), "rate", 1044601336);
        setIntField(term103723, term103723.getClass(), "maxRate", 562228242);
        setIntField(term103723, term103723.getClass(), "classValue", 995283566);
        setIntField(term103723, term103723.getClass(), "maxClassValue", 1311217437);
        setIntField(term103723, term103723.getClass(), "totalWinNum", 289716613);
        setIntField(term103723, term103723.getClass(), "totalLoseNum", 2114806182);
        setIntField(term103723, term103723.getClass(), "maxWinNum", 41155687);
        setIntField(term103723, term103723.getClass(), "maxLoseNum", 1224581311);
        setIntField(term103723, term103723.getClass(), "winNum", 1017569554);
        setIntField(term103723, term103723.getClass(), "loseNum", -1457930793);
        setIntField(term103723, term103723.getClass(), "npcTotalWinNum", -1761017199);
        setIntField(term103723, term103723.getClass(), "npcTotalLoseNum", -1171889960);
        setIntField(term103723, term103723.getClass(), "npcMaxWinNum", -708194098);
        setIntField(term103723, term103723.getClass(), "npcMaxLoseNum", 613501922);
        setIntField(term103723, term103723.getClass(), "npcWinNum", -1145481353);
        setIntField(term103723, term103723.getClass(), "npcLoseNum", -69628972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNpcMaxLoseNum", argTypes, term103723, args);
    }

};


