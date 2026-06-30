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

public class UserDetail_getFirstGameId_193492002041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4252767;

    public UserDetail_getFirstGameId_193492002041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4252771 = new Long(3652673223683322909L);
        Integer term4252834 = new Integer(-1457506209);
        Integer term4252836 = new Integer(-1619288980);
        Integer term4252838 = new Integer(-1191842125);
        ArrayList term4252832 = new ArrayList();
        ((ArrayList) term4252832).add(term4252834);
        ((ArrayList) term4252832).add(term4252836);
        ((ArrayList) term4252832).add(term4252838);
        Integer term4252844 = new Integer(800085811);
        Integer term4252846 = new Integer(-991536181);
        Integer term4252848 = new Integer(1245758357);
        Integer term4252850 = new Integer(957593927);
        Integer term4252852 = new Integer(1947837575);
        Integer term4252854 = new Integer(1877399032);
        Integer term4252856 = new Integer(-322909871);
        ArrayList term4252842 = new ArrayList();
        ((ArrayList) term4252842).add(term4252844);
        ((ArrayList) term4252842).add(term4252846);
        ((ArrayList) term4252842).add(term4252848);
        ((ArrayList) term4252842).add(term4252850);
        ((ArrayList) term4252842).add(term4252852);
        ((ArrayList) term4252842).add(term4252854);
        ((ArrayList) term4252842).add(term4252856);
        term4252767 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4252769 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4252785 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4252786 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4252790 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4252795 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4252796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4252800 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4252767, term4252767.getClass(), "id", -8599249918098829412L);
        setLongField(term4252769, term4252769.getClass(), "id", 7287370473750053586L);
        setField(term4252769, term4252769.getClass(), "extId", term4252771);
        setField(term4252769, term4252769.getClass(), "luid", "KmInogqKEC");
        setIntField(term4252786, term4252786.getClass(), "year", 2029);
        setShortField(term4252786, term4252786.getClass(), "month", (short) 10);
        setShortField(term4252786, term4252786.getClass(), "day", (short) 6);
        setField(term4252785, term4252785.getClass(), "date", term4252786);
        setByteField(term4252790, term4252790.getClass(), "hour", (byte) 22);
        setByteField(term4252790, term4252790.getClass(), "minute", (byte) 14);
        setByteField(term4252790, term4252790.getClass(), "second", (byte) 57);
        setIntField(term4252790, term4252790.getClass(), "nano", 423372286);
        setField(term4252785, term4252785.getClass(), "time", term4252790);
        setField(term4252769, term4252769.getClass(), "registerTime", term4252785);
        setIntField(term4252796, term4252796.getClass(), "year", 2017);
        setShortField(term4252796, term4252796.getClass(), "month", (short) 11);
        setShortField(term4252796, term4252796.getClass(), "day", (short) 17);
        setField(term4252795, term4252795.getClass(), "date", term4252796);
        setByteField(term4252800, term4252800.getClass(), "hour", (byte) 9);
        setByteField(term4252800, term4252800.getClass(), "minute", (byte) 46);
        setByteField(term4252800, term4252800.getClass(), "second", (byte) 26);
        setIntField(term4252800, term4252800.getClass(), "nano", 690392788);
        setField(term4252795, term4252795.getClass(), "time", term4252800);
        setField(term4252769, term4252769.getClass(), "accessTime", term4252795);
        setField(term4252767, term4252767.getClass(), "card", term4252769);
        setField(term4252767, term4252767.getClass(), "userName", "vghurnXTBh");
        setIntField(term4252767, term4252767.getClass(), "isNetMember", -592672189);
        setIntField(term4252767, term4252767.getClass(), "iconId", -1012901171);
        setIntField(term4252767, term4252767.getClass(), "plateId", -653470969);
        setIntField(term4252767, term4252767.getClass(), "titleId", 1723196322);
        setIntField(term4252767, term4252767.getClass(), "partnerId", -363399865);
        setIntField(term4252767, term4252767.getClass(), "frameId", 91768252);
        setIntField(term4252767, term4252767.getClass(), "selectMapId", -72159806);
        setIntField(term4252767, term4252767.getClass(), "totalAwake", -1936708582);
        setIntField(term4252767, term4252767.getClass(), "gradeRating", -720988645);
        setIntField(term4252767, term4252767.getClass(), "musicRating", 334996059);
        setIntField(term4252767, term4252767.getClass(), "playerRating", 1350021850);
        setIntField(term4252767, term4252767.getClass(), "highestRating", 1566117400);
        setIntField(term4252767, term4252767.getClass(), "gradeRank", -233049802);
        setIntField(term4252767, term4252767.getClass(), "classRank", 1302137274);
        setIntField(term4252767, term4252767.getClass(), "courseRank", 1522375508);
        setField(term4252767, term4252767.getClass(), "charaSlot", term4252832);
        setField(term4252767, term4252767.getClass(), "charaLockSlot", term4252842);
        setLongField(term4252767, term4252767.getClass(), "contentBit", 3279891102057055744L);
        setIntField(term4252767, term4252767.getClass(), "playCount", -488541201);
        setField(term4252767, term4252767.getClass(), "eventWatchedDate", "cMrkDpfuPm");
        setField(term4252767, term4252767.getClass(), "lastGameId", "GxRQZgHrPa");
        setField(term4252767, term4252767.getClass(), "lastRomVersion", "fKXRUrSMUu");
        setField(term4252767, term4252767.getClass(), "lastDataVersion", "HiVFsutGGO");
        setField(term4252767, term4252767.getClass(), "lastLoginDate", "SFJwkiqlgz");
        setField(term4252767, term4252767.getClass(), "lastPlayDate", "ZyxLuCBxJm");
        setIntField(term4252767, term4252767.getClass(), "lastPlayCredit", 1528847143);
        setIntField(term4252767, term4252767.getClass(), "lastPlayMode", 1040539434);
        setIntField(term4252767, term4252767.getClass(), "lastPlaceId", 1966962449);
        setField(term4252767, term4252767.getClass(), "lastPlaceName", "psjkOEoxRT");
        setIntField(term4252767, term4252767.getClass(), "lastAllNetId", -597344561);
        setIntField(term4252767, term4252767.getClass(), "lastRegionId", -1767679763);
        setField(term4252767, term4252767.getClass(), "lastRegionName", "fpaMVBWAOp");
        setField(term4252767, term4252767.getClass(), "lastClientId", "yLpCAwXEpt");
        setField(term4252767, term4252767.getClass(), "lastCountryCode", "bYkbNXLaJy");
        setIntField(term4252767, term4252767.getClass(), "lastSelectEMoney", 237587455);
        setIntField(term4252767, term4252767.getClass(), "lastSelectTicket", -367642817);
        setIntField(term4252767, term4252767.getClass(), "lastSelectCourse", 1746448930);
        setIntField(term4252767, term4252767.getClass(), "lastCountCourse", -1877134970);
        setField(term4252767, term4252767.getClass(), "firstGameId", "gnHanWeaXm");
        setField(term4252767, term4252767.getClass(), "firstRomVersion", "aVisfGPLDO");
        setField(term4252767, term4252767.getClass(), "firstDataVersion", "PigzEJwrrb");
        setField(term4252767, term4252767.getClass(), "firstPlayDate", "xloKxawTLh");
        setField(term4252767, term4252767.getClass(), "compatibleCmVersion", "DMRLwBvNWP");
        setField(term4252767, term4252767.getClass(), "dailyBonusDate", "EYQVLHFRgt");
        setField(term4252767, term4252767.getClass(), "dailyCourseBonusDate", "vmOmDrKsih");
        setField(term4252767, term4252767.getClass(), "lastPairLoginDate", "KbWHXlTuFs");
        setField(term4252767, term4252767.getClass(), "lastTrialPlayDate", "ZUqCQSpskm");
        setIntField(term4252767, term4252767.getClass(), "playVsCount", 722482071);
        setIntField(term4252767, term4252767.getClass(), "playSyncCount", 535456785);
        setIntField(term4252767, term4252767.getClass(), "winCount", -1315524295);
        setIntField(term4252767, term4252767.getClass(), "helpCount", -210729787);
        setIntField(term4252767, term4252767.getClass(), "comboCount", -1930435685);
        setLongField(term4252767, term4252767.getClass(), "totalDeluxscore", 6874161960293638693L);
        setLongField(term4252767, term4252767.getClass(), "totalBasicDeluxscore", 2567764437798675337L);
        setLongField(term4252767, term4252767.getClass(), "totalAdvancedDeluxscore", 5903868249697244151L);
        setLongField(term4252767, term4252767.getClass(), "totalExpertDeluxscore", 3346364745966886050L);
        setLongField(term4252767, term4252767.getClass(), "totalMasterDeluxscore", -5527305391653386668L);
        setLongField(term4252767, term4252767.getClass(), "totalReMasterDeluxscore", 5678081307755041505L);
        setIntField(term4252767, term4252767.getClass(), "totalSync", -781489743);
        setIntField(term4252767, term4252767.getClass(), "totalBasicSync", 1145221927);
        setIntField(term4252767, term4252767.getClass(), "totalAdvancedSync", -806487192);
        setIntField(term4252767, term4252767.getClass(), "totalExpertSync", 442532996);
        setIntField(term4252767, term4252767.getClass(), "totalMasterSync", 641550453);
        setIntField(term4252767, term4252767.getClass(), "totalReMasterSync", -998534931);
        setLongField(term4252767, term4252767.getClass(), "totalAchievement", 3866061870811556079L);
        setLongField(term4252767, term4252767.getClass(), "totalBasicAchievement", 8775760569887085455L);
        setLongField(term4252767, term4252767.getClass(), "totalAdvancedAchievement", -3754192056722441916L);
        setLongField(term4252767, term4252767.getClass(), "totalExpertAchievement", -7345447675577238938L);
        setLongField(term4252767, term4252767.getClass(), "totalMasterAchievement", 3994627283833662720L);
        setLongField(term4252767, term4252767.getClass(), "totalReMasterAchievement", 4650180178105679004L);
        setLongField(term4252767, term4252767.getClass(), "playerOldRating", 1854172354738200224L);
        setLongField(term4252767, term4252767.getClass(), "playerNewRating", 4935299241844170784L);
        setIntField(term4252767, term4252767.getClass(), "banState", 1499096169);
        setLongField(term4252767, term4252767.getClass(), "dateTime", 8485341746274574423L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term4252767, args);
    }

};


