package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setNameplateId_286401805319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220679;
     Object term4220756;

    public UserData_setNameplateId_286401805319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4220679 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4220679, term4220679.getClass(), "id", 0L);
        setField(term4220679, term4220679.getClass(), "card", null);
        setField(term4220679, term4220679.getClass(), "userName", null);
        setIntField(term4220679, term4220679.getClass(), "level", 0);
        setIntField(term4220679, term4220679.getClass(), "reincarnationNum", 0);
        setField(term4220679, term4220679.getClass(), "exp", null);
        setLongField(term4220679, term4220679.getClass(), "point", 0L);
        setLongField(term4220679, term4220679.getClass(), "totalPoint", 0L);
        setIntField(term4220679, term4220679.getClass(), "playCount", 0);
        setIntField(term4220679, term4220679.getClass(), "multiPlayCount", 0);
        setIntField(term4220679, term4220679.getClass(), "playerRating", 0);
        setIntField(term4220679, term4220679.getClass(), "highestRating", 0);
        setIntField(term4220679, term4220679.getClass(), "nameplateId", 0);
        setIntField(term4220679, term4220679.getClass(), "frameId", 0);
        setIntField(term4220679, term4220679.getClass(), "characterId", 0);
        setIntField(term4220679, term4220679.getClass(), "trophyId", 0);
        setIntField(term4220679, term4220679.getClass(), "playedTutorialBit", 0);
        setIntField(term4220679, term4220679.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4220679, term4220679.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4220679, term4220679.getClass(), "totalMapNum", 0);
        setLongField(term4220679, term4220679.getClass(), "totalHiScore", 0L);
        setLongField(term4220679, term4220679.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4220679, term4220679.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4220679, term4220679.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4220679, term4220679.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4220679, term4220679.getClass(), "totalUltimaHighScore", 0L);
        setField(term4220679, term4220679.getClass(), "eventWatchedDate", null);
        setIntField(term4220679, term4220679.getClass(), "friendCount", 0);
        setField(term4220679, term4220679.getClass(), "firstGameId", null);
        setField(term4220679, term4220679.getClass(), "firstRomVersion", null);
        setField(term4220679, term4220679.getClass(), "firstDataVersion", null);
        setField(term4220679, term4220679.getClass(), "firstPlayDate", null);
        setField(term4220679, term4220679.getClass(), "lastGameId", null);
        setField(term4220679, term4220679.getClass(), "lastRomVersion", null);
        setField(term4220679, term4220679.getClass(), "lastDataVersion", null);
        setField(term4220679, term4220679.getClass(), "lastLoginDate", null);
        setField(term4220679, term4220679.getClass(), "lastPlayDate", null);
        setIntField(term4220679, term4220679.getClass(), "lastPlaceId", 0);
        setField(term4220679, term4220679.getClass(), "lastPlaceName", null);
        setField(term4220679, term4220679.getClass(), "lastRegionId", null);
        setField(term4220679, term4220679.getClass(), "lastRegionName", null);
        setField(term4220679, term4220679.getClass(), "lastAllNetId", null);
        setField(term4220679, term4220679.getClass(), "lastClientId", null);
        setField(term4220679, term4220679.getClass(), "lastCountryCode", null);
        setField(term4220679, term4220679.getClass(), "userNameEx", null);
        setField(term4220679, term4220679.getClass(), "compatibleCmVersion", null);
        setIntField(term4220679, term4220679.getClass(), "medal", 0);
        setIntField(term4220679, term4220679.getClass(), "mapIconId", 0);
        setIntField(term4220679, term4220679.getClass(), "voiceId", 0);
        setIntField(term4220679, term4220679.getClass(), "avatarWear", 0);
        setIntField(term4220679, term4220679.getClass(), "avatarHead", 0);
        setIntField(term4220679, term4220679.getClass(), "avatarFace", 0);
        setIntField(term4220679, term4220679.getClass(), "avatarSkin", 0);
        setIntField(term4220679, term4220679.getClass(), "avatarItem", 0);
        setIntField(term4220679, term4220679.getClass(), "avatarFront", 0);
        setIntField(term4220679, term4220679.getClass(), "avatarBack", 0);
        setIntField(term4220679, term4220679.getClass(), "classEmblemBase", 0);
        setIntField(term4220679, term4220679.getClass(), "classEmblemMedal", 0);
        setIntField(term4220679, term4220679.getClass(), "stockedGridCount", 0);
        setIntField(term4220679, term4220679.getClass(), "exMapLoopCount", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattlePlayCount", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattleWinCount", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattleLoseCount", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4220679, term4220679.getClass(), "charaIllustId", 0);
        setIntField(term4220679, term4220679.getClass(), "skillId", 0);
        setIntField(term4220679, term4220679.getClass(), "overPowerPoint", 0);
        setIntField(term4220679, term4220679.getClass(), "overPowerRate", 0);
        setIntField(term4220679, term4220679.getClass(), "overPowerLowerRank", 0);
        setIntField(term4220679, term4220679.getClass(), "avatarPoint", 0);
        setIntField(term4220679, term4220679.getClass(), "battleRankId", 0);
        setIntField(term4220679, term4220679.getClass(), "battleRankPoint", 0);
        setIntField(term4220679, term4220679.getClass(), "eliteRankPoint", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattle1stCount", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattle2ndCount", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattle3rdCount", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattle4thCount", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattleCorrection", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattleErrCnt", 0);
        setIntField(term4220679, term4220679.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4220679, term4220679.getClass(), "battleRewardStatus", 0);
        setIntField(term4220679, term4220679.getClass(), "battleRewardIndex", 0);
        setIntField(term4220679, term4220679.getClass(), "battleRewardCount", 0);
        setIntField(term4220679, term4220679.getClass(), "ext1", 0);
        setIntField(term4220679, term4220679.getClass(), "ext2", 0);
        setIntField(term4220679, term4220679.getClass(), "ext3", 0);
        setIntField(term4220679, term4220679.getClass(), "ext4", 0);
        setIntField(term4220679, term4220679.getClass(), "ext5", 0);
        setIntField(term4220679, term4220679.getClass(), "ext6", 0);
        setIntField(term4220679, term4220679.getClass(), "ext7", 0);
        setIntField(term4220679, term4220679.getClass(), "ext8", 0);
        setIntField(term4220679, term4220679.getClass(), "ext9", 0);
        setIntField(term4220679, term4220679.getClass(), "ext10", 0);
        setField(term4220679, term4220679.getClass(), "extStr1", null);
        setField(term4220679, term4220679.getClass(), "extStr2", null);
        setLongField(term4220679, term4220679.getClass(), "extLong1", 0L);
        setLongField(term4220679, term4220679.getClass(), "extLong2", 0L);
        setField(term4220679, term4220679.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4220679, term4220679.getClass(), "isNetBattleHost", false);
        setIntField(term4220679, term4220679.getClass(), "netBattleEndState", 0);
        term4220756 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4220756;
        callMethod(klass, "setNameplateId", argTypes, term4220679, args);
    }

};


