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

public class UserData_setAvatarFace_864962343357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289123;
     Object term289200;

    public UserData_setAvatarFace_864962343357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289123 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289123, term289123.getClass(), "id", 0L);
        setField(term289123, term289123.getClass(), "card", null);
        setField(term289123, term289123.getClass(), "userName", null);
        setIntField(term289123, term289123.getClass(), "level", 0);
        setIntField(term289123, term289123.getClass(), "reincarnationNum", 0);
        setField(term289123, term289123.getClass(), "exp", null);
        setLongField(term289123, term289123.getClass(), "point", 0L);
        setLongField(term289123, term289123.getClass(), "totalPoint", 0L);
        setIntField(term289123, term289123.getClass(), "playCount", 0);
        setIntField(term289123, term289123.getClass(), "multiPlayCount", 0);
        setIntField(term289123, term289123.getClass(), "playerRating", 0);
        setIntField(term289123, term289123.getClass(), "highestRating", 0);
        setIntField(term289123, term289123.getClass(), "nameplateId", 0);
        setIntField(term289123, term289123.getClass(), "frameId", 0);
        setIntField(term289123, term289123.getClass(), "characterId", 0);
        setIntField(term289123, term289123.getClass(), "trophyId", 0);
        setIntField(term289123, term289123.getClass(), "playedTutorialBit", 0);
        setIntField(term289123, term289123.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289123, term289123.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289123, term289123.getClass(), "totalMapNum", 0);
        setLongField(term289123, term289123.getClass(), "totalHiScore", 0L);
        setLongField(term289123, term289123.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289123, term289123.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289123, term289123.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289123, term289123.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289123, term289123.getClass(), "totalUltimaHighScore", 0L);
        setField(term289123, term289123.getClass(), "eventWatchedDate", null);
        setIntField(term289123, term289123.getClass(), "friendCount", 0);
        setField(term289123, term289123.getClass(), "firstGameId", null);
        setField(term289123, term289123.getClass(), "firstRomVersion", null);
        setField(term289123, term289123.getClass(), "firstDataVersion", null);
        setField(term289123, term289123.getClass(), "firstPlayDate", null);
        setField(term289123, term289123.getClass(), "lastGameId", null);
        setField(term289123, term289123.getClass(), "lastRomVersion", null);
        setField(term289123, term289123.getClass(), "lastDataVersion", null);
        setField(term289123, term289123.getClass(), "lastLoginDate", null);
        setField(term289123, term289123.getClass(), "lastPlayDate", null);
        setIntField(term289123, term289123.getClass(), "lastPlaceId", 0);
        setField(term289123, term289123.getClass(), "lastPlaceName", null);
        setField(term289123, term289123.getClass(), "lastRegionId", null);
        setField(term289123, term289123.getClass(), "lastRegionName", null);
        setField(term289123, term289123.getClass(), "lastAllNetId", null);
        setField(term289123, term289123.getClass(), "lastClientId", null);
        setField(term289123, term289123.getClass(), "lastCountryCode", null);
        setField(term289123, term289123.getClass(), "userNameEx", null);
        setField(term289123, term289123.getClass(), "compatibleCmVersion", null);
        setIntField(term289123, term289123.getClass(), "medal", 0);
        setIntField(term289123, term289123.getClass(), "mapIconId", 0);
        setIntField(term289123, term289123.getClass(), "voiceId", 0);
        setIntField(term289123, term289123.getClass(), "avatarWear", 0);
        setIntField(term289123, term289123.getClass(), "avatarHead", 0);
        setIntField(term289123, term289123.getClass(), "avatarFace", 0);
        setIntField(term289123, term289123.getClass(), "avatarSkin", 0);
        setIntField(term289123, term289123.getClass(), "avatarItem", 0);
        setIntField(term289123, term289123.getClass(), "avatarFront", 0);
        setIntField(term289123, term289123.getClass(), "avatarBack", 0);
        setIntField(term289123, term289123.getClass(), "classEmblemBase", 0);
        setIntField(term289123, term289123.getClass(), "classEmblemMedal", 0);
        setIntField(term289123, term289123.getClass(), "stockedGridCount", 0);
        setIntField(term289123, term289123.getClass(), "exMapLoopCount", 0);
        setIntField(term289123, term289123.getClass(), "netBattlePlayCount", 0);
        setIntField(term289123, term289123.getClass(), "netBattleWinCount", 0);
        setIntField(term289123, term289123.getClass(), "netBattleLoseCount", 0);
        setIntField(term289123, term289123.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289123, term289123.getClass(), "charaIllustId", 0);
        setIntField(term289123, term289123.getClass(), "skillId", 0);
        setIntField(term289123, term289123.getClass(), "overPowerPoint", 0);
        setIntField(term289123, term289123.getClass(), "overPowerRate", 0);
        setIntField(term289123, term289123.getClass(), "overPowerLowerRank", 0);
        setIntField(term289123, term289123.getClass(), "avatarPoint", 0);
        setIntField(term289123, term289123.getClass(), "battleRankId", 0);
        setIntField(term289123, term289123.getClass(), "battleRankPoint", 0);
        setIntField(term289123, term289123.getClass(), "eliteRankPoint", 0);
        setIntField(term289123, term289123.getClass(), "netBattle1stCount", 0);
        setIntField(term289123, term289123.getClass(), "netBattle2ndCount", 0);
        setIntField(term289123, term289123.getClass(), "netBattle3rdCount", 0);
        setIntField(term289123, term289123.getClass(), "netBattle4thCount", 0);
        setIntField(term289123, term289123.getClass(), "netBattleCorrection", 0);
        setIntField(term289123, term289123.getClass(), "netBattleErrCnt", 0);
        setIntField(term289123, term289123.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289123, term289123.getClass(), "battleRewardStatus", 0);
        setIntField(term289123, term289123.getClass(), "battleRewardIndex", 0);
        setIntField(term289123, term289123.getClass(), "battleRewardCount", 0);
        setIntField(term289123, term289123.getClass(), "ext1", 0);
        setIntField(term289123, term289123.getClass(), "ext2", 0);
        setIntField(term289123, term289123.getClass(), "ext3", 0);
        setIntField(term289123, term289123.getClass(), "ext4", 0);
        setIntField(term289123, term289123.getClass(), "ext5", 0);
        setIntField(term289123, term289123.getClass(), "ext6", 0);
        setIntField(term289123, term289123.getClass(), "ext7", 0);
        setIntField(term289123, term289123.getClass(), "ext8", 0);
        setIntField(term289123, term289123.getClass(), "ext9", 0);
        setIntField(term289123, term289123.getClass(), "ext10", 0);
        setField(term289123, term289123.getClass(), "extStr1", null);
        setField(term289123, term289123.getClass(), "extStr2", null);
        setLongField(term289123, term289123.getClass(), "extLong1", 0L);
        setLongField(term289123, term289123.getClass(), "extLong2", 0L);
        setField(term289123, term289123.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289123, term289123.getClass(), "isNetBattleHost", false);
        setIntField(term289123, term289123.getClass(), "netBattleEndState", 0);
        term289200 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289200;
        callMethod(klass, "setAvatarFace", argTypes, term289123, args);
    }

};


