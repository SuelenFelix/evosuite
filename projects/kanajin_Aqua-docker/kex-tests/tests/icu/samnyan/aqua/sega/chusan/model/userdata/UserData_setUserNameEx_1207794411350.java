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

public class UserData_setUserNameEx_1207794411350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288574;

    public UserData_setUserNameEx_1207794411350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288574 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term288574, term288574.getClass(), "id", 0L);
        setField(term288574, term288574.getClass(), "card", null);
        setField(term288574, term288574.getClass(), "userName", null);
        setIntField(term288574, term288574.getClass(), "level", 0);
        setIntField(term288574, term288574.getClass(), "reincarnationNum", 0);
        setField(term288574, term288574.getClass(), "exp", null);
        setLongField(term288574, term288574.getClass(), "point", 0L);
        setLongField(term288574, term288574.getClass(), "totalPoint", 0L);
        setIntField(term288574, term288574.getClass(), "playCount", 0);
        setIntField(term288574, term288574.getClass(), "multiPlayCount", 0);
        setIntField(term288574, term288574.getClass(), "playerRating", 0);
        setIntField(term288574, term288574.getClass(), "highestRating", 0);
        setIntField(term288574, term288574.getClass(), "nameplateId", 0);
        setIntField(term288574, term288574.getClass(), "frameId", 0);
        setIntField(term288574, term288574.getClass(), "characterId", 0);
        setIntField(term288574, term288574.getClass(), "trophyId", 0);
        setIntField(term288574, term288574.getClass(), "playedTutorialBit", 0);
        setIntField(term288574, term288574.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term288574, term288574.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term288574, term288574.getClass(), "totalMapNum", 0);
        setLongField(term288574, term288574.getClass(), "totalHiScore", 0L);
        setLongField(term288574, term288574.getClass(), "totalBasicHighScore", 0L);
        setLongField(term288574, term288574.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term288574, term288574.getClass(), "totalExpertHighScore", 0L);
        setLongField(term288574, term288574.getClass(), "totalMasterHighScore", 0L);
        setLongField(term288574, term288574.getClass(), "totalUltimaHighScore", 0L);
        setField(term288574, term288574.getClass(), "eventWatchedDate", null);
        setIntField(term288574, term288574.getClass(), "friendCount", 0);
        setField(term288574, term288574.getClass(), "firstGameId", null);
        setField(term288574, term288574.getClass(), "firstRomVersion", null);
        setField(term288574, term288574.getClass(), "firstDataVersion", null);
        setField(term288574, term288574.getClass(), "firstPlayDate", null);
        setField(term288574, term288574.getClass(), "lastGameId", null);
        setField(term288574, term288574.getClass(), "lastRomVersion", null);
        setField(term288574, term288574.getClass(), "lastDataVersion", null);
        setField(term288574, term288574.getClass(), "lastLoginDate", null);
        setField(term288574, term288574.getClass(), "lastPlayDate", null);
        setIntField(term288574, term288574.getClass(), "lastPlaceId", 0);
        setField(term288574, term288574.getClass(), "lastPlaceName", null);
        setField(term288574, term288574.getClass(), "lastRegionId", null);
        setField(term288574, term288574.getClass(), "lastRegionName", null);
        setField(term288574, term288574.getClass(), "lastAllNetId", null);
        setField(term288574, term288574.getClass(), "lastClientId", null);
        setField(term288574, term288574.getClass(), "lastCountryCode", null);
        setField(term288574, term288574.getClass(), "userNameEx", null);
        setField(term288574, term288574.getClass(), "compatibleCmVersion", null);
        setIntField(term288574, term288574.getClass(), "medal", 0);
        setIntField(term288574, term288574.getClass(), "mapIconId", 0);
        setIntField(term288574, term288574.getClass(), "voiceId", 0);
        setIntField(term288574, term288574.getClass(), "avatarWear", 0);
        setIntField(term288574, term288574.getClass(), "avatarHead", 0);
        setIntField(term288574, term288574.getClass(), "avatarFace", 0);
        setIntField(term288574, term288574.getClass(), "avatarSkin", 0);
        setIntField(term288574, term288574.getClass(), "avatarItem", 0);
        setIntField(term288574, term288574.getClass(), "avatarFront", 0);
        setIntField(term288574, term288574.getClass(), "avatarBack", 0);
        setIntField(term288574, term288574.getClass(), "classEmblemBase", 0);
        setIntField(term288574, term288574.getClass(), "classEmblemMedal", 0);
        setIntField(term288574, term288574.getClass(), "stockedGridCount", 0);
        setIntField(term288574, term288574.getClass(), "exMapLoopCount", 0);
        setIntField(term288574, term288574.getClass(), "netBattlePlayCount", 0);
        setIntField(term288574, term288574.getClass(), "netBattleWinCount", 0);
        setIntField(term288574, term288574.getClass(), "netBattleLoseCount", 0);
        setIntField(term288574, term288574.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term288574, term288574.getClass(), "charaIllustId", 0);
        setIntField(term288574, term288574.getClass(), "skillId", 0);
        setIntField(term288574, term288574.getClass(), "overPowerPoint", 0);
        setIntField(term288574, term288574.getClass(), "overPowerRate", 0);
        setIntField(term288574, term288574.getClass(), "overPowerLowerRank", 0);
        setIntField(term288574, term288574.getClass(), "avatarPoint", 0);
        setIntField(term288574, term288574.getClass(), "battleRankId", 0);
        setIntField(term288574, term288574.getClass(), "battleRankPoint", 0);
        setIntField(term288574, term288574.getClass(), "eliteRankPoint", 0);
        setIntField(term288574, term288574.getClass(), "netBattle1stCount", 0);
        setIntField(term288574, term288574.getClass(), "netBattle2ndCount", 0);
        setIntField(term288574, term288574.getClass(), "netBattle3rdCount", 0);
        setIntField(term288574, term288574.getClass(), "netBattle4thCount", 0);
        setIntField(term288574, term288574.getClass(), "netBattleCorrection", 0);
        setIntField(term288574, term288574.getClass(), "netBattleErrCnt", 0);
        setIntField(term288574, term288574.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term288574, term288574.getClass(), "battleRewardStatus", 0);
        setIntField(term288574, term288574.getClass(), "battleRewardIndex", 0);
        setIntField(term288574, term288574.getClass(), "battleRewardCount", 0);
        setIntField(term288574, term288574.getClass(), "ext1", 0);
        setIntField(term288574, term288574.getClass(), "ext2", 0);
        setIntField(term288574, term288574.getClass(), "ext3", 0);
        setIntField(term288574, term288574.getClass(), "ext4", 0);
        setIntField(term288574, term288574.getClass(), "ext5", 0);
        setIntField(term288574, term288574.getClass(), "ext6", 0);
        setIntField(term288574, term288574.getClass(), "ext7", 0);
        setIntField(term288574, term288574.getClass(), "ext8", 0);
        setIntField(term288574, term288574.getClass(), "ext9", 0);
        setIntField(term288574, term288574.getClass(), "ext10", 0);
        setField(term288574, term288574.getClass(), "extStr1", null);
        setField(term288574, term288574.getClass(), "extStr2", null);
        setLongField(term288574, term288574.getClass(), "extLong1", 0L);
        setLongField(term288574, term288574.getClass(), "extLong2", 0L);
        setField(term288574, term288574.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term288574, term288574.getClass(), "isNetBattleHost", false);
        setIntField(term288574, term288574.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserNameEx", argTypes, term288574, args);
    }

};


