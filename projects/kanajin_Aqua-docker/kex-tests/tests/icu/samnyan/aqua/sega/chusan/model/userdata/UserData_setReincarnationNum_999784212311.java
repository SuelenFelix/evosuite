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

public class UserData_setReincarnationNum_999784212311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220049;
     Object term4220126;

    public UserData_setReincarnationNum_999784212311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4220049 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4220049, term4220049.getClass(), "id", 0L);
        setField(term4220049, term4220049.getClass(), "card", null);
        setField(term4220049, term4220049.getClass(), "userName", null);
        setIntField(term4220049, term4220049.getClass(), "level", 0);
        setIntField(term4220049, term4220049.getClass(), "reincarnationNum", 0);
        setField(term4220049, term4220049.getClass(), "exp", null);
        setLongField(term4220049, term4220049.getClass(), "point", 0L);
        setLongField(term4220049, term4220049.getClass(), "totalPoint", 0L);
        setIntField(term4220049, term4220049.getClass(), "playCount", 0);
        setIntField(term4220049, term4220049.getClass(), "multiPlayCount", 0);
        setIntField(term4220049, term4220049.getClass(), "playerRating", 0);
        setIntField(term4220049, term4220049.getClass(), "highestRating", 0);
        setIntField(term4220049, term4220049.getClass(), "nameplateId", 0);
        setIntField(term4220049, term4220049.getClass(), "frameId", 0);
        setIntField(term4220049, term4220049.getClass(), "characterId", 0);
        setIntField(term4220049, term4220049.getClass(), "trophyId", 0);
        setIntField(term4220049, term4220049.getClass(), "playedTutorialBit", 0);
        setIntField(term4220049, term4220049.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4220049, term4220049.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4220049, term4220049.getClass(), "totalMapNum", 0);
        setLongField(term4220049, term4220049.getClass(), "totalHiScore", 0L);
        setLongField(term4220049, term4220049.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4220049, term4220049.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4220049, term4220049.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4220049, term4220049.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4220049, term4220049.getClass(), "totalUltimaHighScore", 0L);
        setField(term4220049, term4220049.getClass(), "eventWatchedDate", null);
        setIntField(term4220049, term4220049.getClass(), "friendCount", 0);
        setField(term4220049, term4220049.getClass(), "firstGameId", null);
        setField(term4220049, term4220049.getClass(), "firstRomVersion", null);
        setField(term4220049, term4220049.getClass(), "firstDataVersion", null);
        setField(term4220049, term4220049.getClass(), "firstPlayDate", null);
        setField(term4220049, term4220049.getClass(), "lastGameId", null);
        setField(term4220049, term4220049.getClass(), "lastRomVersion", null);
        setField(term4220049, term4220049.getClass(), "lastDataVersion", null);
        setField(term4220049, term4220049.getClass(), "lastLoginDate", null);
        setField(term4220049, term4220049.getClass(), "lastPlayDate", null);
        setIntField(term4220049, term4220049.getClass(), "lastPlaceId", 0);
        setField(term4220049, term4220049.getClass(), "lastPlaceName", null);
        setField(term4220049, term4220049.getClass(), "lastRegionId", null);
        setField(term4220049, term4220049.getClass(), "lastRegionName", null);
        setField(term4220049, term4220049.getClass(), "lastAllNetId", null);
        setField(term4220049, term4220049.getClass(), "lastClientId", null);
        setField(term4220049, term4220049.getClass(), "lastCountryCode", null);
        setField(term4220049, term4220049.getClass(), "userNameEx", null);
        setField(term4220049, term4220049.getClass(), "compatibleCmVersion", null);
        setIntField(term4220049, term4220049.getClass(), "medal", 0);
        setIntField(term4220049, term4220049.getClass(), "mapIconId", 0);
        setIntField(term4220049, term4220049.getClass(), "voiceId", 0);
        setIntField(term4220049, term4220049.getClass(), "avatarWear", 0);
        setIntField(term4220049, term4220049.getClass(), "avatarHead", 0);
        setIntField(term4220049, term4220049.getClass(), "avatarFace", 0);
        setIntField(term4220049, term4220049.getClass(), "avatarSkin", 0);
        setIntField(term4220049, term4220049.getClass(), "avatarItem", 0);
        setIntField(term4220049, term4220049.getClass(), "avatarFront", 0);
        setIntField(term4220049, term4220049.getClass(), "avatarBack", 0);
        setIntField(term4220049, term4220049.getClass(), "classEmblemBase", 0);
        setIntField(term4220049, term4220049.getClass(), "classEmblemMedal", 0);
        setIntField(term4220049, term4220049.getClass(), "stockedGridCount", 0);
        setIntField(term4220049, term4220049.getClass(), "exMapLoopCount", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattlePlayCount", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattleWinCount", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattleLoseCount", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4220049, term4220049.getClass(), "charaIllustId", 0);
        setIntField(term4220049, term4220049.getClass(), "skillId", 0);
        setIntField(term4220049, term4220049.getClass(), "overPowerPoint", 0);
        setIntField(term4220049, term4220049.getClass(), "overPowerRate", 0);
        setIntField(term4220049, term4220049.getClass(), "overPowerLowerRank", 0);
        setIntField(term4220049, term4220049.getClass(), "avatarPoint", 0);
        setIntField(term4220049, term4220049.getClass(), "battleRankId", 0);
        setIntField(term4220049, term4220049.getClass(), "battleRankPoint", 0);
        setIntField(term4220049, term4220049.getClass(), "eliteRankPoint", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattle1stCount", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattle2ndCount", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattle3rdCount", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattle4thCount", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattleCorrection", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattleErrCnt", 0);
        setIntField(term4220049, term4220049.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4220049, term4220049.getClass(), "battleRewardStatus", 0);
        setIntField(term4220049, term4220049.getClass(), "battleRewardIndex", 0);
        setIntField(term4220049, term4220049.getClass(), "battleRewardCount", 0);
        setIntField(term4220049, term4220049.getClass(), "ext1", 0);
        setIntField(term4220049, term4220049.getClass(), "ext2", 0);
        setIntField(term4220049, term4220049.getClass(), "ext3", 0);
        setIntField(term4220049, term4220049.getClass(), "ext4", 0);
        setIntField(term4220049, term4220049.getClass(), "ext5", 0);
        setIntField(term4220049, term4220049.getClass(), "ext6", 0);
        setIntField(term4220049, term4220049.getClass(), "ext7", 0);
        setIntField(term4220049, term4220049.getClass(), "ext8", 0);
        setIntField(term4220049, term4220049.getClass(), "ext9", 0);
        setIntField(term4220049, term4220049.getClass(), "ext10", 0);
        setField(term4220049, term4220049.getClass(), "extStr1", null);
        setField(term4220049, term4220049.getClass(), "extStr2", null);
        setLongField(term4220049, term4220049.getClass(), "extLong1", 0L);
        setLongField(term4220049, term4220049.getClass(), "extLong2", 0L);
        setField(term4220049, term4220049.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4220049, term4220049.getClass(), "isNetBattleHost", false);
        setIntField(term4220049, term4220049.getClass(), "netBattleEndState", 0);
        term4220126 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4220126;
        callMethod(klass, "setReincarnationNum", argTypes, term4220049, args);
    }

};


