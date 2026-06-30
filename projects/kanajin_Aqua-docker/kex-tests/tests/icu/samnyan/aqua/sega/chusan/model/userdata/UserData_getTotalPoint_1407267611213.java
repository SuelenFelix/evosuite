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

public class UserData_getTotalPoint_1407267611213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277975;

    public UserData_getTotalPoint_1407267611213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277975 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term277975, term277975.getClass(), "id", 0L);
        setField(term277975, term277975.getClass(), "card", null);
        setField(term277975, term277975.getClass(), "userName", null);
        setIntField(term277975, term277975.getClass(), "level", 0);
        setIntField(term277975, term277975.getClass(), "reincarnationNum", 0);
        setField(term277975, term277975.getClass(), "exp", null);
        setLongField(term277975, term277975.getClass(), "point", 0L);
        setLongField(term277975, term277975.getClass(), "totalPoint", 0L);
        setIntField(term277975, term277975.getClass(), "playCount", 0);
        setIntField(term277975, term277975.getClass(), "multiPlayCount", 0);
        setIntField(term277975, term277975.getClass(), "playerRating", 0);
        setIntField(term277975, term277975.getClass(), "highestRating", 0);
        setIntField(term277975, term277975.getClass(), "nameplateId", 0);
        setIntField(term277975, term277975.getClass(), "frameId", 0);
        setIntField(term277975, term277975.getClass(), "characterId", 0);
        setIntField(term277975, term277975.getClass(), "trophyId", 0);
        setIntField(term277975, term277975.getClass(), "playedTutorialBit", 0);
        setIntField(term277975, term277975.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term277975, term277975.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term277975, term277975.getClass(), "totalMapNum", 0);
        setLongField(term277975, term277975.getClass(), "totalHiScore", 0L);
        setLongField(term277975, term277975.getClass(), "totalBasicHighScore", 0L);
        setLongField(term277975, term277975.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term277975, term277975.getClass(), "totalExpertHighScore", 0L);
        setLongField(term277975, term277975.getClass(), "totalMasterHighScore", 0L);
        setLongField(term277975, term277975.getClass(), "totalUltimaHighScore", 0L);
        setField(term277975, term277975.getClass(), "eventWatchedDate", null);
        setIntField(term277975, term277975.getClass(), "friendCount", 0);
        setField(term277975, term277975.getClass(), "firstGameId", null);
        setField(term277975, term277975.getClass(), "firstRomVersion", null);
        setField(term277975, term277975.getClass(), "firstDataVersion", null);
        setField(term277975, term277975.getClass(), "firstPlayDate", null);
        setField(term277975, term277975.getClass(), "lastGameId", null);
        setField(term277975, term277975.getClass(), "lastRomVersion", null);
        setField(term277975, term277975.getClass(), "lastDataVersion", null);
        setField(term277975, term277975.getClass(), "lastLoginDate", null);
        setField(term277975, term277975.getClass(), "lastPlayDate", null);
        setIntField(term277975, term277975.getClass(), "lastPlaceId", 0);
        setField(term277975, term277975.getClass(), "lastPlaceName", null);
        setField(term277975, term277975.getClass(), "lastRegionId", null);
        setField(term277975, term277975.getClass(), "lastRegionName", null);
        setField(term277975, term277975.getClass(), "lastAllNetId", null);
        setField(term277975, term277975.getClass(), "lastClientId", null);
        setField(term277975, term277975.getClass(), "lastCountryCode", null);
        setField(term277975, term277975.getClass(), "userNameEx", null);
        setField(term277975, term277975.getClass(), "compatibleCmVersion", null);
        setIntField(term277975, term277975.getClass(), "medal", 0);
        setIntField(term277975, term277975.getClass(), "mapIconId", 0);
        setIntField(term277975, term277975.getClass(), "voiceId", 0);
        setIntField(term277975, term277975.getClass(), "avatarWear", 0);
        setIntField(term277975, term277975.getClass(), "avatarHead", 0);
        setIntField(term277975, term277975.getClass(), "avatarFace", 0);
        setIntField(term277975, term277975.getClass(), "avatarSkin", 0);
        setIntField(term277975, term277975.getClass(), "avatarItem", 0);
        setIntField(term277975, term277975.getClass(), "avatarFront", 0);
        setIntField(term277975, term277975.getClass(), "avatarBack", 0);
        setIntField(term277975, term277975.getClass(), "classEmblemBase", 0);
        setIntField(term277975, term277975.getClass(), "classEmblemMedal", 0);
        setIntField(term277975, term277975.getClass(), "stockedGridCount", 0);
        setIntField(term277975, term277975.getClass(), "exMapLoopCount", 0);
        setIntField(term277975, term277975.getClass(), "netBattlePlayCount", 0);
        setIntField(term277975, term277975.getClass(), "netBattleWinCount", 0);
        setIntField(term277975, term277975.getClass(), "netBattleLoseCount", 0);
        setIntField(term277975, term277975.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term277975, term277975.getClass(), "charaIllustId", 0);
        setIntField(term277975, term277975.getClass(), "skillId", 0);
        setIntField(term277975, term277975.getClass(), "overPowerPoint", 0);
        setIntField(term277975, term277975.getClass(), "overPowerRate", 0);
        setIntField(term277975, term277975.getClass(), "overPowerLowerRank", 0);
        setIntField(term277975, term277975.getClass(), "avatarPoint", 0);
        setIntField(term277975, term277975.getClass(), "battleRankId", 0);
        setIntField(term277975, term277975.getClass(), "battleRankPoint", 0);
        setIntField(term277975, term277975.getClass(), "eliteRankPoint", 0);
        setIntField(term277975, term277975.getClass(), "netBattle1stCount", 0);
        setIntField(term277975, term277975.getClass(), "netBattle2ndCount", 0);
        setIntField(term277975, term277975.getClass(), "netBattle3rdCount", 0);
        setIntField(term277975, term277975.getClass(), "netBattle4thCount", 0);
        setIntField(term277975, term277975.getClass(), "netBattleCorrection", 0);
        setIntField(term277975, term277975.getClass(), "netBattleErrCnt", 0);
        setIntField(term277975, term277975.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term277975, term277975.getClass(), "battleRewardStatus", 0);
        setIntField(term277975, term277975.getClass(), "battleRewardIndex", 0);
        setIntField(term277975, term277975.getClass(), "battleRewardCount", 0);
        setIntField(term277975, term277975.getClass(), "ext1", 0);
        setIntField(term277975, term277975.getClass(), "ext2", 0);
        setIntField(term277975, term277975.getClass(), "ext3", 0);
        setIntField(term277975, term277975.getClass(), "ext4", 0);
        setIntField(term277975, term277975.getClass(), "ext5", 0);
        setIntField(term277975, term277975.getClass(), "ext6", 0);
        setIntField(term277975, term277975.getClass(), "ext7", 0);
        setIntField(term277975, term277975.getClass(), "ext8", 0);
        setIntField(term277975, term277975.getClass(), "ext9", 0);
        setIntField(term277975, term277975.getClass(), "ext10", 0);
        setField(term277975, term277975.getClass(), "extStr1", null);
        setField(term277975, term277975.getClass(), "extStr2", null);
        setLongField(term277975, term277975.getClass(), "extLong1", 0L);
        setLongField(term277975, term277975.getClass(), "extLong2", 0L);
        setField(term277975, term277975.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term277975, term277975.getClass(), "isNetBattleHost", false);
        setIntField(term277975, term277975.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term277975, args);
    }

};


